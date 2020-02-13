package java_easy;

//Write a function that calculates the nth Fibonacci number.
public class RecursionFibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(fib(8));
        System.out.println(fib(67));
        System.out.println(fib(1));
        System.out.println(fib(53));
    }

    public static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 2) + fib(n - 1);
    }

}
