package java_easy;

//Create a function that returns the index of the first vowel in a string.
public class IndexFirstVowel {

    public static void main(String[] args) {
        System.out.println(firstVowel("apple"));
    }

    /**
     * Input will be single words.
     * Characters in words will be upper or lower case.
     * "y" is not considered a vowel.
     * Input always contains a vowel.
     */
    public static int firstVowel(String str) {
        int id = 0;
        char[] c_arr = str.toLowerCase().toCharArray();
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < c_arr.length; i++)
            if (c_arr[i] == vowels[0] || c_arr[i] == vowels[1] || c_arr[i] == vowels[2] || c_arr[i] == vowels[3] || c_arr[i] == vowels[4]) {
                id = i;
                break;
            }
        return id;
    }

}
