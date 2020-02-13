package java_easy;

/**
 * A palindrome is a word that is identical forward and backwards.
 *
 * mom
 * racecar
 * kayak
 *
 * Given a word, create a function that checks whether it is a palindrome.
 */
public class Palindrome {

    public static void main(String[] args) {
        System.out.println(checkPalindrome("mom"));
        System.out.println(checkPalindrome("scary"));
        System.out.println(checkPalindrome("reviver"));
        System.out.println(checkPalindrome("stressed"));
    }

    /**
     *  All test input is lower cased.
     */
    public static boolean checkPalindrome(String str) {
        char[] c_arr = str.toCharArray();
        String out = "";
        for (int i = c_arr.length - 1; i >= 0; i--)
            out += c_arr[i];
        return out.equals(str);
    }

}
