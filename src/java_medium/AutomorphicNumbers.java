package java_medium;

/**
 * A number n is automorphic if n^2 ends in n.
 *
 * For example: n=5, n^2=25
 *
 * Create a function that takes a number and returns true if the number is automorphic, false if it isn't.
 */
public class AutomorphicNumbers {

    public static void main(String[] args) {
        System.out.println(isAutomorphic(5));
        System.out.println(isAutomorphic(8));
        System.out.println(isAutomorphic(76));
    }

    public static boolean isAutomorphic(int n) {
        String c_arr = String.valueOf(Math.round(Math.pow(n, 2)));
        return c_arr.endsWith(String.valueOf(n));
    }

}
