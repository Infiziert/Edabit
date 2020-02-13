package java_easy;

public class ConvertHoursMinutesToSec {

    public static void main(String[] args) {
        System.out.println(convert(59, 52));
        System.out.println(convert(2, 23));
        System.out.println(convert(521, 61));
        System.out.println(convert(23, 15));
        System.out.println(convert(56, 2));
    }

    public static int convert(int hours, int minutes) {
        return hours * 3600 + minutes * 60;
    }

}
