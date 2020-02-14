package java_hard;

/**
 * Throughout the 12 days of Christmas, my true love gave me in total 364 items.
 *
 * Create a function where given n days as an argument, return the total amount of items received throughout those days as an integer.
 */
public class TetrahedralNumbers {

    public static void main(String[] args) {
        System.out.println(xmasItems(12));
        System.out.println(xmasItems(3));
        System.out.println(xmasItems(31));
        System.out.println(xmasItems(0));
    }

    /**
     * You will only be given valid inputs.
     * Remember to return as an integer.
     * 0 as input should return 0.
     * Look the specific links into the Resources tab for more informations.
     */
    public static int xmasItems(int n) {
        return (n * (n + 1) * (n + 2)) / 6;
    }

}
