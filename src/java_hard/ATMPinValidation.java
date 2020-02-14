package java_hard;

/**
 * ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything but exactly 4 digits or exactly 6 digits.
 * Your task is to create a method that takes a string and returns true if the PIN is valid and false if it's not.
 */
public class ATMPinValidation {

    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("a234"));
        System.out.println(validatePin(""));
    }

    /**
     * Some test cases contain special characters.
     * Empty strings must return false.
     */
    public static boolean validatePin(String s) {
        return s.replaceAll("[^1-9]", "").length() == 4 || s.replaceAll("[^1-9]", "").length() == 6;
    }

}
