/**
 * Say you have a string of characters. Write an algorithm to collect and return a list of all
 * substrings such that order is maintained but characters may be skipped. So “frog” can produce
 * fog, fg, rg, etc.
 */

public class AllSubstrings {
    public static void main(String[] args) {
        String s = "frog";

        // call method to create all substrings
        createSubstrings(s);
    } // end main

    public static void createSubstrings(String s){
        // check if substring is empty. if not, begin creating substrings
        if(!s.isEmpty()) {
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j <= s.length(); j++) {
                    System.out.println(s.substring(i, j));
                }  // end inner for
            } // end outer for
        } // end if
    } // end createSubstring
}   // end class
