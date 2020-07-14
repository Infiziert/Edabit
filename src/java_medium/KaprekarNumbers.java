package java_medium;

/**
 * A Kaprekar Number is a positive integer that, after being squared and split into two lexicographical parts, is equal to the sum of the two new numbers obtained:
 *
 * If the quantity of digits of the squared number is even, the left and right parts will have the same length.
 * If the quantity of digits of the squared number is odd, then the right part will be the longest half, with the left part being the smallest or equal to zero if the quantity of digits is equal to 1.
 */
public class KaprekarNumbers {

    public static void main(String[] args) {
        System.out.println(isKaprekar(1));
        System.out.println(isKaprekar(2));
        System.out.println(isKaprekar(3));
        System.out.println(isKaprekar(5));
        System.out.println(isKaprekar(9));
        System.out.println(isKaprekar(65));
        System.out.println(isKaprekar(99));
        System.out.println(isKaprekar(297));
        System.out.println(isKaprekar(348));
        System.out.println(isKaprekar(666));
        System.out.println(isKaprekar(1441));
        System.out.println(isKaprekar(77778));
        System.out.println(isKaprekar(102102));
        System.out.println(isKaprekar(533170));
    }

    /**
     * Given a positive integer n implement a function that returns true if it's a Kaprekar number, and false if it's not.
     *
     * Trivially, 0 and 1 are Kaprekar Numbers being the only two numbers equal to their square. Any number formed only by digits equal to 9 will always be a Kaprekar Number.
     */

    public static boolean isKaprekar(int n) {
        if (n == 0  || n == 1) return true;
        String n_pow = String.valueOf(Math.round(Math.pow(n, 2)));
        String first_pow_n = n_pow.substring(0, n_pow.length() / 2);
        String last_pow_n = n_pow.substring(n_pow.length() / 2);
        int kap_n = 0;
        try {
            kap_n = Integer.parseInt(first_pow_n) + Integer.parseInt(last_pow_n);
        }catch (NumberFormatException ignored) {}
        return kap_n == n;
    }
}
