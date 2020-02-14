package java_hard;

/**
 * Count the amount of ones in the binary representation of an integer.
 * So for example, since 12 is '1100' in binary, the return value should be 2.
 */
public class CountOnesInBinaryRepresentation {

    public static void main(String[] args) {
        System.out.println(countOnes(0));
        System.out.println(countOnes(100));
        System.out.println(countOnes(999));
    }

    /**
     * The input will always be a valid integer (number).
     */
    public static int countOnes(int n) {
        char[] bin = Integer.toString(n, 2).toCharArray();
        int counter = 0;
        for (char c : bin) if (c == '1') counter++;
        return counter;
    }
}
