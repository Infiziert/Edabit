package java_medium;

// Create a function that capitalizes the last letter of every word.
public class CapitalizeLastLetter {

    public static void main(String[] args) {
        System.out.println(capLast("hello"));
        System.out.println(capLast("My Name is Edabit"));
        System.out.println(capLast("HELp THe LASt LETTERs CAPITALISe"));
    }

    // There won't be any cases of punctuation in the tests.
    public static String capLast(String str) {
        String[] str_arr = str.split(" ");
        for (int i = 0; i < str_arr.length; i++) {
            char[] c_arr = str_arr[i].toCharArray();
            str_arr[i] = str_arr[i].substring(0, str_arr[i].length() - 1) + String.valueOf(c_arr[c_arr.length - 1]).toUpperCase() + " ";
        }
        String out = "";
        for (String s : str_arr) out += s;
        return out.substring(0, out.length() - 1);
    }

}
