package java_hard;

// Create a function that moves all capital letters to the front of a word.
public class MoveCapitalLettersToFront {

    public static void main(String[] args) {
        System.out.println(capToFront("hApPy"));
    }

    /**
     * Keep the original relative order of the upper and lower case letters the same.
     */
    public static String capToFront(String str) {
        return str.replaceAll("[^A-Z]", "") + str.replaceAll("[^a-z]", "");
    }

}
