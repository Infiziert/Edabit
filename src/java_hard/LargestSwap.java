package java_hard;

// Write a function that takes a two-digit number and determines if it's the largest of two possible digit swaps.
public class LargestSwap {

    public static void main(String[] args) {
        System.out.println(largestSwap(27));
        System.out.println(largestSwap(43));
        System.out.println(largestSwap(14));
        System.out.println(largestSwap(53));
        System.out.println(largestSwap(99));
    }

    /**
     * Numbers with two identical digits (third example) should yield true (you can't do better).
     */
    public static boolean largestSwap(int num) {
        StringBuilder str_builder = new StringBuilder(String.valueOf(num));
        int rev_num = Integer.parseInt(str_builder.reverse().toString());
        return num >= rev_num;
    }

}
