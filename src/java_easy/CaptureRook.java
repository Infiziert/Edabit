package java_easy;

//Write a function that returns true if two rooks can attack each other, and false otherwise
public class CaptureRook {

    public static void main(String[] args) {
        System.out.println(canCapture(new String[] {"A1", "B2"})); // expected: false
        System.out.println(canCapture(new String[] {"H4", "H3"})); // expected: true
        System.out.println(canCapture(new String[] {"F5", "C8"})); // expected: false
        System.out.println(canCapture(new String[] {"G3", "G7"})); // expected: true
    }

    /**
     * Assume no blocking pieces.
     * Two rooks can attack each other if they share the same row (letter) or column (number).
     */
    public static boolean canCapture(String[] rooks) {
        char[] r_one = rooks[0].toCharArray();
        char[] r_two = rooks[1].toCharArray();
        return r_one[0] == r_two[0] || r_one[1] == r_two[1];
    }

}
