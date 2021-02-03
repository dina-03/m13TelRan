package de.telran;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(findExtraNumber(99)));
    }

    public static int[] findExtraNumber(int numbers) {
        int[] arr = new int[numbers];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;
    }
}
