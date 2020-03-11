package java_easy;

import java.util.stream.LongStream;

public class PrimeNumberChecker {

    public static void main(String... args) {
        System.out.println(check(1));
        System.out.println(check(2));
        System.out.println(check(3));
        System.out.println(check(4));
        System.out.println(check(5));
        System.out.println(check(6));
        System.out.println(check(7));
        System.out.println(check(8));
        System.out.println(check(9));
        System.out.println(check(10));
        System.out.println(check(11));
        System.out.println(check(12));
        System.out.println(check(13));
        System.out.println(check(14));
        System.out.println(check(15));
        System.out.println(check(16));
        System.out.println(check(17));
        System.out.println(check(18));
        System.out.println(check(19));
        System.out.println(check(20));
    }

    /**
     * (i > 1 && i % i == 0 [true])
     */
    protected static boolean check(long in) {
        return in <= 2 ? in == 2 : LongStream.iterate(2, i -> Math.pow(i, 2) <= in, i -> (long) (i + 1)).noneMatch(i -> in % i == 0);
    }

}
