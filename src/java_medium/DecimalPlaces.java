package java_medium;

import java.util.Arrays;

/**
 * Create a function that returns the number of decimal places a number (given as a string) has.
 * Any zeros after the decimal point count towards the number of decimal places.
 */
public class DecimalPlaces {

    public static void main(String[] args) {
        System.out.println(getDecimalPlace("43.20"));
        System.out.println(getDecimalPlace("400"));
        System.out.println(getDecimalPlace("3.1"));
    }

    /**
     * Return 0 if the number doesn't have any decimal places (see example #2).
     */
    public static int getDecimalPlace(String num) {
        return num.substring(num.length() / 2 + 1).length();
    }

}
