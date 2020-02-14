package java_hard;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * A new number is a number that is not a permutation of any smaller number.
 * 869 is not a new number because it is just a permutation of smaller numbers, 689 and 698.
 * 509 is a new number because it can't be formed by a permutation of any smaller number (leading zeros not allowed).
 */
public class NewNumbers {

    public static void main(String[] args) {
        System.out.println(isNew(0));
        System.out.println(isNew(90));
        System.out.println(isNew(601));
        System.out.println(isNew(123));
        System.out.println(isNew(321));
        System.out.println(isNew(40567));
        System.out.println(isNew(10783));
        System.out.println(isNew(4444));
        System.out.println(isNew(102));
    }

    /**
     * Write a function that takes a non-negative integer and returns true if the integer is a new number and false if it is not.
     * A curious fact: out of the first one million integers, only 8002 are new.
     */
    public static boolean isNew(int num) {
        return (!(num > Integer.parseInt(Arrays.stream(("" + num).split("")).sorted().collect(Collectors.joining()).replaceAll("(0+)([^0])(.*)", "$2$1$3"))));
    }

}
