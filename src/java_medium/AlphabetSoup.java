package java_medium;

import java.util.Arrays;

// Create a method that takes a string and returns a string with its letters in alphabetical order.
public class AlphabetSoup {

    public static void main(String[] args) {
        System.out.println(alphabetSoup("hello"));
        System.out.println(alphabetSoup("edabit"));
        System.out.println(alphabetSoup("hacker"));
        System.out.println(alphabetSoup("geek"));
        System.out.println(alphabetSoup("javascript"));
    }

    /**
     * You can assume numbers and punctuation symbols won't be included in test cases.
     * You'll only have to deal with single word, alphabetic characters.
     */
    public static String alphabetSoup(String s) {
        char[] c_arr = s.toCharArray();
        Arrays.sort(c_arr);
        return new String(c_arr);
    }

}
