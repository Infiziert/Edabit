package java_medium;

import java.util.Arrays;

// Create a function to concatenate two integer arrays.
public class ConcatenatingTwoIntegerArrays {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(concat(new int[]{1, 3, 5}, new int[]{2, 6, 8})));
        System.out.println(Arrays.toString(concat(new int[]{7, 8}, new int[]{10, 9, 1, 1, 2})));
        System.out.println(Arrays.toString(concat(new int[]{4, 5, 1}, new int[]{3, 3, 3, 3, 3})));
    }

    /**
     * Don't forget to return the result.
     * See Resources tab for more info.
     */
    public static int[] concat(int[] arr1, int[] arr2) {
        int[] arr_out = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, arr_out, 0, arr1.length);
        System.arraycopy(arr2, 0, arr_out, arr1.length, arr2.length);
        return arr_out;
    }

}
