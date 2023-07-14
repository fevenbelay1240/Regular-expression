import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.regex.Matcher;

/**
 * Lab 9 testbed for regex practice.
 *
 * @author Feven Mengistu, Nate Anderson
 * @version Spring 2023
 */

public class RegexPractice {

    public static void main(String[] args) {

        //This string is the regular expression we are looking for
        String regex =  "0 [1-7] \\d\\s [0-7]";
        //This string is the text in which we are searching
        String text = "050 12 000 00";

        //Note that we don't construct a Pattern object directly, but instead
        // call the static method to compile that constructs it for us
        Pattern p = Pattern.compile(regex);

        // the matcher method of Pattern constructs and returns a Matcher object
        // which, among other things, allows us to iterate over matching
        // substrings
        Matcher m = p.matcher(text);

        // Matcher's find method finds the next matching substring in the text
        // that matches the regular expression, returning true on success
        while (m.find()) {

            // Matcher's group method returns the substring of the most recent match
            System.out.println(m.group());
        }
       // System.out.println(Arrays.toString(p.split(text)));

    }
}
