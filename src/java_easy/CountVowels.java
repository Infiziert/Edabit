package java_easy;

public class CountVowels {

    public static void main(String[] args) {
        System.out.println(getCount("Nope!"));
        System.out.println(getCount("Celebration"));
        System.out.println(getCount("Palm"));
        System.out.println(getCount("Prediction"));
        System.out.println(getCount("Suite"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] s_c = str.toLowerCase().toCharArray();

        for (char c : s_c)
            if (c == vowels[0] || c == vowels[1] || c == vowels[2] || c == vowels[3] || c == vowels[4])
                vowelsCount++;

        return vowelsCount;
    }

}
