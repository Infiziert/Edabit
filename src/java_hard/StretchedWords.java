package java_hard;

import java.util.Arrays;

/**
 * Write a function that takes a string, and returns a new string with any duplicate consecutive letters removed.
 */
public class StretchedWords {

    public static void main(String[] args) {
        System.out.println(unstretch("ppoeemm"));
        System.out.println(unstretch("wiiiinnnnd"));
        System.out.println(unstretch("ppoeemm"));
        System.out.println(unstretch("cccccaaarrrbbonnnnn"));
    }

    /**
     * Final strings won't include words with double letters (e.g. "passing", "lottery").
     */
    public static String unstretch(String word) {
        char[] c_arr = word.toCharArray();
        try {
            for (int i = 0; i < c_arr.length; i++)
                if (c_arr[i] == c_arr[i + 1]) c_arr[i] = ' ';
        }catch (ArrayIndexOutOfBoundsException ignore) {}
        String out = "";
        for (char c : c_arr) if (c != ' ') out += c;
        return out.trim();
    }
}
