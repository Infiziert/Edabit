package java_hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Create a function that takes an array of strings and returns the words that are exactly four letters.
public class ReturnFourLetterString {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(isFourLetters(new String[]{"Tomato", "Potato", "Pair"})));
        System.out.println(Arrays.toString(isFourLetters(new String[]{"Kangaroo", "Bear", "Fox"})));
        System.out.println(Arrays.toString(isFourLetters(new String[]{"Ryan", "Kieran", "Jason", "Matt"})));
    }

    /**
     * You can expect valid strings for all test cases.
     */
    public static String[] isFourLetters(String[] s) {
        List<String> out_list = new ArrayList<>();
        for (String str : s) if (str.length() == 4) out_list.add(str);
        return out_list.size() == 0 ? new String[] {} :out_list.toArray(new String[out_list.size() - 1]);
    }

}
