package java_medium;

// Write a function that returns the greatest common divisor (GCD) of two integers.
import java.math.BigInteger;

public class GCDofTwoNumbers {

    public static void main(String[] args) {
        System.out.println(gcd(8, 12));
    }

    /**
     * Both values will be positive.
     * The GCD is the largest factor that divides both numbers.
     */
    public static int gcd(int n1, int n2) {
        BigInteger n1_big = BigInteger.valueOf(n1);
        BigInteger n2_big = BigInteger.valueOf(n2);
        return n1_big.gcd(n2_big).intValue();
    }

}
