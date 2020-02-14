package java_hard;

import java.util.regex.Pattern;

/**
 * Create a method that takes a string, removes all "special" characters (e.g. !, @, #, $, %, ^, &, \, *, (, )) and returns the new string.
 * The only non-alphanumeric characters allowed are dashes -, underscores _ and spaces.
 */
public class RemoveSpecialChars {

    public static void main(String[] args) {
        System.out.println(removeSpecialCharacters("The quick brown fox!"));
        System.out.println(removeSpecialCharacters("%fd76$fd(-)6GvKlO."));
        System.out.println(removeSpecialCharacters("D0n$c sed 0di0 du1"));
    }

    public static String removeSpecialCharacters(String str) {
        return str.replaceAll("[^A-Za-z0-9\\-_ ]", "");
    }

}
