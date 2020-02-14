package java_hard;

/**
 * Create a method that takes a string as an argument and converts the first character of each word to uppercase.
 * Return the newly formatted string.
 */
public class CapitalizeFirstLetter {

    public static void main(String[] args) {
        System.out.println(makeTitle("This is a title"));
        System.out.println(makeTitle("capitalize every word"));
        System.out.println(makeTitle("I Like Pizza"));
        System.out.println(makeTitle("PIZZA PIZZA PIZZA"));
    }

    /**
     * You can expect a valid string for each test case.
     */
    public static String makeTitle(String str) {
        String[] s_arr = str.split(" ");
        String out = "";
        for (String s : s_arr) out += String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1) + " ";
        return out.substring(0, out.length() - 1);
    }

}
