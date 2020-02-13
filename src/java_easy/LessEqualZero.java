package java_easy;

public class LessEqualZero {

    public static void main(String[] args) {
        System.out.println(lessThanOrEqualToZero(5));
        System.out.println(lessThanOrEqualToZero(-12));
        System.out.println(lessThanOrEqualToZero(0));
        System.out.println(lessThanOrEqualToZero(65));
        System.out.println(lessThanOrEqualToZero(-2521));
    }

    public static boolean lessThanOrEqualToZero(int num) {
        return num <= 0;
    }

}
