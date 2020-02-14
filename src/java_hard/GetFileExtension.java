package java_hard;

import java.util.Arrays;
import java.util.regex.Pattern;

public class GetFileExtension {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getExtension(new String[]{"code.html", "code.css"})));
        System.out.println(Arrays.toString(getExtension(new String[]{"project1.jpg", "project1.pdf", "project1.mp3"})));
        System.out.println(Arrays.toString(getExtension(new String[]{"ruby.rb", "cplusplus.cpp", "python.py", "javascript.js"})));
    }

    public static String[] getExtension(String[] arr) {
        String[] out = new String[] {};
        for (String s : arr) out = add(out, s.split(Pattern.quote("."))[1]);
        return out;
    }
    protected static String[] add(String[] arr, String element) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = element;
        return arr;
    }
}
