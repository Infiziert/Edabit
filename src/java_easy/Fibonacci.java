package java_easy;

//Create a function that, given a number, returns the corresponding Fibonacci number.
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(3));
        System.out.println(fibonacci(7));
        System.out.println(fibonacci(12));
    }

    /**
     * The first number in the sequence starts at 1 (not 0).
     *
     *  It depends on which position you start, if the first position is identified with the number one or zero.
     */
    public static int fibonacci(int a) {
        if (a == 0) return 1; // so the first number in the sequence starts at 1 and not at 0 so we return 1
        else if (a == 1) return 1;
        else return fibonacci(a - 1) + fibonacci(a - 2);
    }
}
