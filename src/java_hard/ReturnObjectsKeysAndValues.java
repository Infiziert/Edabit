package java_hard;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Create a method that takes a Map<String, String> and return the values as a separate array.
 */
public class ReturnObjectsKeysAndValues {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "1");
        map.put("b", "2");
        map.put("c", "3");
        map.put("d", "4");
        System.out.println(Arrays.toString(getValues(map)));
    }


    public static String[] getValues(Map<String, String> map) {
        String[] out = new String[] {};
        for (String s : map.values()) out = add(out, s);
        return out;
    }

    protected static String[] add(String[] arr, String element) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = element;
        return arr;
    }
}
