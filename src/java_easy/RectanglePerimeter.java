package java_easy;

public class RectanglePerimeter {

    public static void main(String[] args) {
        System.out.println(findPerimeter(2, 1));
        System.out.println(findPerimeter(51, 5));
        System.out.println(findPerimeter(23, 23));
        System.out.println(findPerimeter(1, 75));
        System.out.println(findPerimeter(5, 12));
    }

    public static int findPerimeter(int height, int width) {
        return 2 * (height + width);
    }

}
