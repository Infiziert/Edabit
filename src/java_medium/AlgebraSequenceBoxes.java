package java_medium;

/** Create a function that takes a number (step) as an argument and returns the amount of boxes in that step of the sequence.
 * See also @resources
 *
**/
public class AlgebraSequenceBoxes {

    public static void main(String[] args) {
        System.out.println(boxSeq(1));
        System.out.println(boxSeq(2));
        System.out.println(boxSeq(0));
        System.out.println(boxSeq(6));
    }

    // Step (the input) is always a positive integer (or zero).
    public static int boxSeq(int step) {
        if (step == 0) return 0;
        int count = 0;
        for (int i = 0; i < step; i++) {
            if (i % 2 != 0) count--;
            else count += 3;
        }
        return count;
    }

}
