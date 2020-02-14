package java_medium;

// Create a function that returns "even" if a number has an even number of factors and "odd" if a number has an odd number of factors.
public class EvenOddNumberOfFactors {

    public static void main(String[] args) {
        System.out.println(factorGroup(33));
        System.out.println(factorGroup(36));
        System.out.println(factorGroup(7));
    }

    /**
     * You don't need to actually calculate the factors to solve this problem.
     * Think about why a number would have an odd number of factors.
     */
    public static String factorGroup(int num) {
        return Math.sqrt(num) % 1 != 0 ? "even" : "odd";
    }

}
