package java_medium;

//Write a function that returns the first n vowels of a string.
public class FirstNVowels {

    public static void main(String[] args) {
        System.out.println(firstNVowels("sharpening skills", 3));
        System.out.println(firstNVowels("major league", 5));
        System.out.println(firstNVowels("crabby patty", 2));
        System.out.println(firstNVowels("shrimp", 1));
        System.out.println(firstNVowels("shrimpy", 2));
        System.out.println(firstNVowels("hostess", 5));
    }

    /**
     * Return "invalid" if the n exceeds the number of vowels in a string.
     * Vowels are: a, e, i, o, u
     */
    public static String firstNVowels(String str, int n) {
        String n_str = str.replaceAll("[^aeiouAEIOU]", "");
        if (n_str.length() < n) return "invalid";
        return n_str.substring(0, n);
    }

} 
