package java_easy;

public class AreaTriangle {

    public static void main(String[] args) {
        System.out.println(triArea(52, 9));
        System.out.println(triArea(52, 247));
        System.out.println(triArea(5331, 2));
        System.out.println(triArea(21, 95));
        System.out.println(triArea(7, 1));
        System.out.println(triArea(23, 5));
    }

    public static int triArea(int base, int height) {
        return (base * height) / 2;
    }

}
