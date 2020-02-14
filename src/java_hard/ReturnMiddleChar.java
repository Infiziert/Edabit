package java_hard;

/**
 * Create a function that takes a string and returns the middle character(s).
 * <p>
 * If the word's length is odd, return the middle character.
 * If the word's length is even, return the middle two characters.
 */
public class ReturnMiddleChar {

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("middle"));
    }

    /**
     * All test cases contain a single word (as a string).
     */
    public static String getMiddle(String s) {
        char[] c_arr = s.toCharArray();
        return s.length() % 2 != 0 ? String.valueOf(c_arr[s.length() / 2]) : String.valueOf(c_arr[s.length() / 2 - 1]) + c_arr[((s.length()) / 2)];
    }
}
