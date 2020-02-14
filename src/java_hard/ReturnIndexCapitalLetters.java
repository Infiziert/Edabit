package java_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create a method that takes a single string as argument and returns an ordered array containing the indices of all capital letters in the string.
 */
public class ReturnIndexCapitalLetters {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(indexOfCaps("eDaBiT")));
        System.out.println(Arrays.toString(indexOfCaps("eQuINoX")));
        System.out.println(Arrays.toString(indexOfCaps("determine")));
        System.out.println(Arrays.toString(indexOfCaps("STRIKE")));
        System.out.println(Arrays.toString(indexOfCaps("sUn")));
    }

    /**
     * Return an empty array if no uppercase letters are found in the string.
     * Special characters ($#@%) and numbers will be included in some test cases.
     */
    public static int[] indexOfCaps(String s) {
        List<Character> char_list = new ArrayList<>();
        int[] out = new int[] {};
        for (char c : s.toCharArray()) char_list.add(c);
        String reg_s = s.replaceAll("[^A-Z]", "");
        for (char c : reg_s.toCharArray()) out = add(out, char_list.indexOf(c));
        return out;
    }

    protected static int[] add(int[] arr, int element) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = element;
        return arr;
    }

}
