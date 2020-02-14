package java_hard;

import java.util.Arrays;

/**
 * An isogram is a word that has no repeating letters, consecutive or nonconsecutive.
 * Create a function that takes a string and returns either true or false depending on whether or not it's an "isogram".
 */
public class Isogram {

    public static void main(String[] args) {
        System.out.println(isIsogram("Algorism"));
        System.out.println(isIsogram("Password"));
        System.out.println(isIsogram("consecutive"));
    }

    /**
     * Ignore letter case (should not be case sensitive).
     * All test cases contain valid one word strings.
     */
    public static boolean isIsogram(String str) {
        char[] c_arr = str.toLowerCase().toCharArray();
        Arrays.sort(c_arr);
        for (int i = 0; i < c_arr.length - 1; i++) if (c_arr[i] == c_arr[i + 1]) return false;
        return true;
    }

}
