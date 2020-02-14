package java_hard;

/**
 * Create a function that returns a base 2 (binary) represetation of a base 10 (decimal) string number.
 * To convert is simple: ((2) means base 2 and (10) means base 10) 010101001(2) = 1 + 8 + 32 + 128.
 * <p>
 * Going from right to left, the value of the most right bit is 1, now from that every bit to the left will be x2 the value, value of an 8 bit binary numbers are (256, 128, 64, 32, 16, 8, 4, 2, 1).
 */
public class ConvertNumToBase2 {

    public static void main(String[] args) {
        System.out.println(binary(1));
        System.out.println(binary(5));
        System.out.println(binary(10));
    }

    /**
     * Numbers will always be below 1024 (not including 1024).
     * The && operator could be useful. Where?
     * The strings will always go to the length at which the most left bit's value gets bigger than the number in decimal.
     */
    public static String binary(int decimal) {
        return Integer.toString(decimal, 2);
    }

}
