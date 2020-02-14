package java_medium;

/**
 * Write a function that receives two portions of a path and joins them.
 * The portions will be joined with the "/" separator.
 * There could be only one separator and if it is not present it should be added.
 */
public class JoinTwoPortionsOfPath {

    public static void main(String[] args) {
        System.out.println(joinPath("portion1", "portion2"));
        System.out.println(joinPath("portion1/", "portion2"));
        System.out.println(joinPath("portion1", "/portion2"));
        System.out.println(joinPath("portion1/", "/portion2"));
    }

    /**
     * Try not to solve this challenge using only if-else conditions.
     */
    public static String joinPath(String portion1, String portion2) {
        return portion1.replaceAll("[/]", "") + "/" + portion2.replaceAll("[/]", "");
    }

}
