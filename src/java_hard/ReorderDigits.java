package java_hard;

import java.util.Arrays;
import java.util.Collections;

/**
 * Create a function that reorders the digits of each numerical element in an array based on ascending (asc) or descending (desc) order.
 */
public class ReorderDigits {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reorderDigits(new int[]{515, 341, 98, 44, 211}, "asc")));
        System.out.println(Arrays.toString(reorderDigits(new int[]{515, 341, 98, 44, 211}, "desc")));
        System.out.println(Arrays.toString(reorderDigits(new int[]{63251, 78221}, "asc")));
        System.out.println(Arrays.toString(reorderDigits(new int[]{63251, 78221}, "desc")));
        System.out.println(Arrays.toString(reorderDigits(new int[]{1, 2, 3, 4}, "asc")));
        System.out.println(Arrays.toString(reorderDigits(new int[]{1, 2, 3, 4}, "desc")));
    }

    /**
     * Single-digit numbers should be ordered the same regardless of direction.
     * Numbers in the array should be kept the same order.
     */
    public static int[] reorderDigits(int[] arr, String orderBy) {
        return orderBy.equals("desc") ? Arrays.stream(arr).boxed().sorted(Collections.reverseOrder()).mapToInt(Integer::intValue).toArray()
                : orderBy.equals("asc") ? Arrays.stream(arr).boxed().sorted().mapToInt(Integer::intValue).toArray() : null;
    }

}
