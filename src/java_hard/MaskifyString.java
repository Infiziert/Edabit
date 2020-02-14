package java_hard;

/**
 * Usually when you sign up for an account to buy something, your credit card number, phone number or answer to a secret question is partially obscured in some way.
 * Since someone could look over your shoulder, you don't want that shown on your screen.
 * Hence, the website masks these strings.
 *
 * Your task is to create a function that takes a string, transforms all but the last four characters into "#" and returns the new masked string.
 */
public class MaskifyString {

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
        System.out.println(maskify("64607935616"));
        System.out.println(maskify("1"));
        System.out.println(maskify(""));
    }

    /**
     * The maskify function must accept a string of any length.
     * An empty string should return an empty string (fourth example above).
     */
    public static String maskify(String s) {
        if (s.length() <= 5) return s;
        char[] c_arr = s.toCharArray();
        for (int i = 0; i < c_arr.length - 4; i++) c_arr[i] = '#';
        return String.valueOf(c_arr);
    }

}
