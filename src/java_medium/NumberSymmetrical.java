package java_medium;

/**
 * Create a function that takes a number as an argument and returns true or false depending on whether the number is symmetrical or not.
 * A number is symmetrical when it is the same as its reverse.
 */
public class NumberSymmetrical {

    public static void main(String[] args) {
        System.out.println(isSymmetrical(7227));
        System.out.println(isSymmetrical(12567));
        System.out.println(isSymmetrical(44444444));
        System.out.println(isSymmetrical(9939));
        System.out.println(isSymmetrical(1112111));
    }

    public static boolean isSymmetrical(int num) {
        int num_rev = 0;
        for (int i = num; i != 0; i /= 10) num_rev = num_rev * 10 + i % 10;
        return num == num_rev;
    }

}