package java_hard;

import javax.swing.text.MaskFormatter;
import java.text.ParseException;

/**
 * Create a method that accepts a string and returns true if it's in the format of a proper phone number and false if it's not.
 * Assume any number between 0-9 (in the appropriate spots) will produce a valid phone number.
 * This is what a valid phone number looks like: (123) 456-7890
 */
public class PhoneNumberFormattedCorrect {

    public static void main(String[] args) {
        System.out.println(isValidPhoneNumber("(123) 456-7890"));
        System.out.println(isValidPhoneNumber("1111)555 2345"));
        System.out.println(isValidPhoneNumber("098) 123 4567"));
    }

    /**
     * Don't forget the space after the closing parentheses.
     */
    public static boolean isValidPhoneNumber(String s) {
        String blank_s = s.replaceAll("[^0-9]", "");
        String mask = "(###) ###-####";
        try {
            MaskFormatter maskFormatter = new MaskFormatter(mask);
            maskFormatter.setValueContainsLiteralCharacters(false);
            blank_s = maskFormatter.valueToString(blank_s);
        }catch (ParseException ignore) {}
        return blank_s.equals(s);
    }

}
