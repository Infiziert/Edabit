package java_medium;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Sigilize {

    public static void main(String... args) {
        System.out.println(sigilize("ooooooooo"));
    }

    public static String sigilize(String desire) {
        String des = desire;
        des = des.replaceAll("[aeiouAEIOU ]", "");
        des = Arrays.stream(des.split("")).distinct().collect(Collectors.joining());
        return des;
    }
}
