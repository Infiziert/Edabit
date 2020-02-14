package java_medium;

// Write a function that takes all even-indexed characters and odd-indexed characters from a string and concatenates them together.
public class IndexShuffle {

    public static void main(String[] args) {
        System.out.println(indexShuffle("abcd"));
    }

    /**
     * 0 should be treated as an even number.
     */
    public static String indexShuffle(String str) {
        char[] c_arr = str.toCharArray();
        String even_indexed = "";
        String odd_indexed = "";
        for (int i = 0; i < c_arr.length; i++)
            if (i % 2 == 0) even_indexed = even_indexed + c_arr[i];
            else odd_indexed = odd_indexed + c_arr[i];
        return even_indexed + odd_indexed;
    }
}
