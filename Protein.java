import java.util.regex.Pattern;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;

/*
 *  read the 2VAOA.txt file and use Java regular expressions to determine the length of the longest
 *  uninterrupted sequence of “H” characters and the longest uninterrupted sequence of “E”
 *  characters in the secondary structure, and then print each, separated by a space.

 * 
 * @author - Feven Mengistu, Nate Anderson
 * @version - Spring 2023
 */
public class Protein {
    public static void main(String[] args) throws FileNotFoundException {

        // variables
        String line = "";
        int biggest;
        int biggest2;
        String longest;
        String longest2;

        // get the 4th line of the input file
        try (Scanner scanner = new Scanner(new File("2VAOA.txt"))) {
            for (int i = 0; i < 3; i++) {
                scanner.nextLine();
            }
            line = scanner.nextLine();
        }
        // this string is the regular expression we are looking for for both E and H
        String regex = "H*";
        String regex2 = "E*";

        // this string is the text in which we are searching
        String text = line;

        // note that we don't construct a Pattern object directly, but instead
        // call the static method compile that constructs it for us
        Pattern p = Pattern.compile(regex);
        Pattern p2 = Pattern.compile(regex2);

        // the matcher method of Pattern constructs and returns a Matcher object
        // which, among other things, allows us to iterate over matching
        // substrings
        Matcher m = p.matcher(text);
        Matcher m2 = p2.matcher(text);

        biggest = 0;
        biggest2 = 0;

        // Matcher's find method finds the next matching substring in the text
        // that matches the regular expression, returning true on success
        while (m.find()) {
            // Matcher's group method returns the substring of the most recent match
            longest = m.group();
            // compares the length of each match finds and returns the longest one
            if (biggest < longest.length())
                biggest = longest.length();

        }
        while (m2.find()) {
            // Matcher's group method returns the substring of the most recent match
            longest2 = m2.group();
            // compares the length of each match finds and returns the longest one
            if (biggest2 < longest2.length())
                biggest2 = longest2.length();
        }
        // print out the biggest count for each finding group for H and E
        System.out.print(biggest + " " + biggest2);
    }
}
