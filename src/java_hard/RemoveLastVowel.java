package java_hard;

public class RemoveLastVowel {

    public static void main(String[] args) {
        System.out.println(removeLastVowel("Those who dare to fail miserably can achieve greatly."));
    }

    public static String removeLastVowel(String str) {
        String[] s_arr = str.split(" ");
        String out = "";
        for (String s : s_arr) {
            s = reverse(s);
            char[] c_arr = s.toCharArray();
            int id = firstVowel(s);
            c_arr[id] = ' ';
            String s1 = "";
            for (char c : c_arr) if (c != ' ') s1 += c;
            out += reverse(s1) + " ";
        }
        return out.substring(0, out.length() - 1).trim();
    }

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

    public static String reverse(final String str) {
        char[] c_arr = str.toCharArray();
        String out = "";
        for (int i = c_arr.length - 1; i >= 0; i--)
            out += c_arr[i];
        return out;
    }

}
