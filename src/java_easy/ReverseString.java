package java_easy;

//Create a method that takes a string as its argument and returns the string in reversed order.
public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverse("Hello World!"));
    }

    /**
     * You can expect a valid string for all test cases.
     */
    public static String reverse(String str) {
        char[] c_arr = str.toCharArray();
        String out = "";
        for (int i = c_arr.length - 1; i >= 0; i--)
            out += c_arr[i];
        return out;
    }

}
