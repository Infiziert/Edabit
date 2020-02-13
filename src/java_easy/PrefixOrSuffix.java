package java_easy;


/**
 * Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
 *
 * isPrefix should return true if it begins with the prefix argument.
 * isSuffix should return true if it ends with the suffix argument.
 * Otherwise return false.
 */
public class PrefixOrSuffix {

    public static void main(String[] args) {
        System.out.println(isPrefix("automation", "auto-"));
        System.out.println(isPrefix("superfluous", "super-"));
        System.out.println(isPrefix("oration", "mega-"));
        System.out.println(isPrefix("retrospect", "sub-"));
        System.out.println(isSuffix("arachnophobia", "-phobia"));
        System.out.println(isSuffix("rhinoplasty", "-plasty"));
        System.out.println(isSuffix("movement", "-scope"));
        System.out.println(isSuffix("vocation", "-logy"));
    }

    /**
     *  The prefix and suffix arguments have dashes - in them.
     */
    public static boolean isPrefix(String word, String prefix) {
        String p_new = prefix.substring(0, prefix.length() - 1);
        String w_new = word.substring(0, p_new.length());
        return p_new.equals(w_new);
    }

    /**
     *  The prefix and suffix arguments have dashes - in them.
     */
    public static boolean isSuffix(String word, String prefix) {
        String p_new = prefix.substring(1);
        String w_new = reverse(reverse(word).substring(0, p_new.length()));
        return p_new.equals(w_new);
    }

    protected static String reverse(final String str) {
        char[] c_arr = str.toCharArray();
        String out = "";
        for (int i = c_arr.length - 1; i >= 0; i--)
            out += c_arr[i];
        return out;
    }

}
