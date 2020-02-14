package java_medium;

import java.util.*;

// Create a function that finds all even numbers from 1 to the given number.
public class EvenNumberGenerator {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findEvenNums(8))); // [2, 4, 6, 8]
        System.out.println(Arrays.toString(findEvenNums(4))); // [2, 4]
        System.out.println(Arrays.toString(findEvenNums(2))); // [2]
        System.out.println(Arrays.toString(findEvenNums(1))); // []
        System.out.println(Arrays.toString(findEvenNums(9))); // [2, 4, 6, 8]
        System.out.println(Arrays.toString(findEvenNums(11))); // [2, 4, 6, 8, 10]
    }

    /**
     * If there are no even numbers, return an empty array.
     */
    public static int[] findEvenNums(int num) {
        int[] even = {};
        for (int i = 1; i <= num; i++)
            if (i % 2 == 0)
                even = add(even, i);
        return even;
    }

    protected static int[] add(int[] arr, int element) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = element;
        return arr;
    }


}
