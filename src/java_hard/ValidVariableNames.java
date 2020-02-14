package java_hard;

/**
 * When creating variables, the variable name must always start with a letter, though numbers and underscores are allowed to be contained in it also.
 *
 * Create a function which returns true if a given variable name is valid, otherwise return false.
 */
public class ValidVariableNames {

    public static void main(String[] args) {
        System.out.println(variableValid("result"));
        System.out.println(variableValid("odd_nums"));
        System.out.println(variableValid("2TimesN"));
        System.out.println(variableValid("count spaces"));
    }

    /**
     * Inputs are given as strings.
     * Variable names with spaces are not allowed.
     * Although this question may seem like otherwise, you can't actually assign words with quotes around them as variables.
     */
    public static boolean variableValid(String str) {
        return str.charAt(0) == str.replaceAll("[^A-Za-z]", "").charAt(0) && str.split(" ").length == 1;
    }

}
