package java_medium;

import java.util.Arrays;

// Create a method that takes an array of integers and returns an array where each integer is the sum of itself + all previous numbers in the array.
public class CumulativeArraySum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(cumulativeSum(new int[]{1, 2, 3})));
    }


    /**
     * Return an empty array if the input is an empty array.
     */
    public static int[] cumulativeSum(int[] nums) {
        int n = 0;
        for (int i = 0; i < nums.length; i++) {
            n = nums[i] + n;
            nums[i] = n;
        }
        return nums;
    }

}
