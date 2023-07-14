/*
 * This program counts the number of times a string appears in another string.
 * 
 * @author Nate Anderson and Feven Mengistu
 * @version 1.0
 */
public class CountMatches{
    public static void main(String [] args){
        if(args.length == 2){
        String s1 = args[0];
        String s2 = args[1];
    
        int found = s1.indexOf(s2, 0);
        if (found == -1){
            System.out.println("No MAtches");
        }
        while (found != -1){
            System.out.print(" " + found);
            found = s1.indexOf(s2, found + 1);
        }     
        
    }else{
        System.out.println("Missing command parameters.");
    }
}
}
