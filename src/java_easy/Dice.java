package java_easy;

import java.util.Arrays;
import java.util.Random;

public class Dice {

    public static void main(String... args) {
        int[] n = cube(50);
        System.out.println(Arrays.toString(n));
        arrayDiced(n);
    }

    public static int[] cube(int amount) {
        int[] nc = new int[] {};
        for (int i = 0; i < amount; i++) nc = add(nc, randomInt(1, 6));
        return nc;
    }

    protected static int[] add(int[] arr, int element) {
        arr = Arrays.copyOf(arr, arr.length + 1);
        arr[arr.length - 1] = element;
        return arr;
    }

    protected static int randomInt(int min, int max) {
        return Math.toIntExact(Math.round(Math.random() * (max - min) + min));
    }

    protected static void arrayDiced(int[] n) {
        int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;
        for (int i : n)
            switch (i) {
                case 1: a++; break;
                case 2: b++; break;
                case 3: c++; break;
                case 4: d++; break;
                case 5: e++; break;
                case 6: f++; break;
            }
        System.out.println("1: " + a + " | 2: " + b + " | 3: " + c + " | 4: " + d + " | 5: " + e + " | 6: " + f);
    }
}

