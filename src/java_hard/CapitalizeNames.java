package java_hard;

import java.util.Arrays;

// Create a method that takes an array of names and returns an array with only the first letter capitalized.
public class CapitalizeNames {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(capMe(new String[]{"mavis", "senaida", "letty"})));
        System.out.println(Arrays.toString(capMe(new String[]{"samuel", "MABELLE", "letitia", "meridith"})));
        System.out.println(Arrays.toString(capMe(new String[]{"Slyvia", "Kristal", "Sharilyn", "Calista"})));
    }

    /**
     * Don't change the order of the original array.
     * Notice in the second example above, "MABELLE" is returned as "Mabelle".
     */
    public static String[] capMe(String[] s) {
        for (int i = 0; i < s.length; i++)
            s[i] = String.valueOf(s[i].charAt(0)).toUpperCase() + s[i].substring(1).toLowerCase();
        return s;
    }

}
