package java_easy;

public class CapitalizeLast {

    public static void main(String... args) {
        System.out.println(capLast("Hello World"));
    }

    public static String capLast(String str) {
        String[] str_arr = str.split(" ");
        String out = "";
        for (String s : str_arr) {
            String n = s.substring(s.length() - 1).toUpperCase();
            System.out.println(n);
            String nw = s.substring(0, s.length() - 1);
            out += (nw + n + " ");
        }
        return out.substring(0, out.length() - 1);
    }

}
