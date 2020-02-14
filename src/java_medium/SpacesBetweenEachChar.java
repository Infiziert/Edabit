package java_medium;

// Create a function that takes a string and returns a string with spaces in between all of the characters.
public class SpacesBetweenEachChar {

    public static void main(String[] args) {
        System.out.println(spaceMeOut("space"));
        System.out.println(spaceMeOut("far out"));
        System.out.println(spaceMeOut("elongated musk"));
    }

    /**
     * Treat a space as its own character (i.e. leave three spaces between words).
     */
    public static String spaceMeOut(String str) {
        String str_out = "";
        char[] c_arr = str.toCharArray();
        for (char c : c_arr) str_out += c + " ";
        return str_out.substring(0, str_out.length() - 1);
    }

}
