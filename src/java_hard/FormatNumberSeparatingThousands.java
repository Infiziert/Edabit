package java_hard;

import java.text.NumberFormat;
import java.util.Locale;

// Create a function that takes a number as an argument and returns a string formatted to separate thousands.
public class FormatNumberSeparatingThousands {

    public static void main(String[] args) {
        System.out.println(formatNum(1000));
    }

    /**
     * You can expect a valid number for all test cases.
     */
    public static String formatNum(int num) {
        return NumberFormat.getNumberInstance(Locale.US).format(num);
    }

}
