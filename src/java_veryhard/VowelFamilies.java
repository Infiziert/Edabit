package java_veryhard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class VowelFamilies {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sameVowelGroup(new String[] {"toe", "ocelot", "maniac"})));
        System.out.println(Arrays.toString(sameVowelGroup(new String[] {"many", "carriage", "emit", "apricot", "animal"})));
    }

    public static String[] sameVowelGroup(String[] words) {
        return Arrays.stream(words).filter(s -> distinctVowels(words[0]).equals(distinctVowels(s))).toArray(String[]::new);
    }

    protected static String distinctVowels(String str) {
        return Arrays.stream(str.split("")).filter(s -> s.matches("[aeiou]")).distinct().sorted().collect(Collectors.joining());
    }

}
