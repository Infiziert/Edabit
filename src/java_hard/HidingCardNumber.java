package java_hard;

/**
 * Write a function that takes a credit card number and only displays the last four characters. The rest of the card number must be replaced by ************.
 */
public class HidingCardNumber {

    public static void main(String[] args) {
        System.out.println(cardHide("1234123456785678")); // ************5678
        System.out.println(cardHide("8754456321113213")); // ************3213
        System.out.println(cardHide("35123413355523")); // **********5523
    }

    /**
     * Ensure you return a string.
     * The length of the string must remain the same as the input.
     */
    public static String cardHide(String str) {
        if (str.length() <= 5) return str;
        char[] c_arr = str.toCharArray();
        for (int i = 0; i < c_arr.length - 4; i++) c_arr[i] = '*';
        return String.valueOf(c_arr);
    }

}
