package java_medium;

// Write a function that transforms all letters from [a, m] to 0 and letters from [n, z] to 1 in a string.
public class TransformingWordsIntoBinaryStrings {

    public static void main(String[] args) {
        System.out.println(convertBinary("house"));
        System.out.println(convertBinary("excLAIM"));
        System.out.println(convertBinary("moon"));
    }

    // Conversion should be case insensitive (see example #2).
    public static String convertBinary(String str) {
        return str.replaceAll("[A-Ma-m]", "0").replaceAll("[N-Zn-z]", "1");
    }

}
