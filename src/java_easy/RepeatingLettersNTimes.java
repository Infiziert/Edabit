package java_easy;

//Create a function that repeats each character in a string n times.
public class RepeatingLettersNTimes {

    public static void main(String[] args) {
        System.out.println(repeat("mice", 5));
    }


    public static String repeat(String str, int n) {
        char[] c_arr = str.toCharArray();
        String out = "";
        for (char c : c_arr)
            for (int i = 0; i < n; i++) out += c;
        return out;
    }

}
