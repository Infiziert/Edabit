package java_hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A group of friends have decided to start a secret society. The name will be the first letter of each of their names, sorted in alphabetical order.
 *
 * Create a function that takes in an array of names and returns the name of the secret society.
 */
public class SecretSociety {

    public static void main(String[] args) {
        System.out.println(societyName(new String[] {"Adam", "Sarah", "Malcolm"}));
        System.out.println(societyName(new String[] {"Harry", "Newt", "Luna", "Cho"}));
        System.out.println(societyName(new String[] {"Phoebe", "Chandler", "Rachel", "Ross", "Monica", "Joey"}));
    }

    /**
     * The secret society's name should be entirely uppercased.
     */
    public static String societyName(String[] s_arr) {
        List<String> list = new ArrayList<>();
        for (String s : s_arr) list.add(String.valueOf(s.charAt(0)));
        Collections.sort(list);
        String society = "";
        for (String s : list) society += s;
        return society.toUpperCase();
    }

}
