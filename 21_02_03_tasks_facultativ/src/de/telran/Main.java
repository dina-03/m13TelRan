package de.telran;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println(reversString("крошка"));
        // findExtraNumber(99);
        // System.out.println(Arrays.toString(randomArrayWithoutADuplicate(99)));
        findExtraNumber(99);
    }

    public static void findExtraNumber(int n) {
        int sum = 0;
        int idx = -1;
        int[] arr = randomArrayWithoutADuplicate(n);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                idx = i;
            } else {
                sum += arr[i];
            }
        }
        int res = (arr.length + 1) * arr.length / 2;
        System.out.println("missing number is: " + (res - sum));
        System.out.println("arrays: " +Arrays.toString(arr));
    }

    public static int[] randomArrayWithoutADuplicate(int numbers) {
        int[] res = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            res[i] = (int) (Math.random() * 100);
            for (int j = 0; j < i; j++) {
                if (res[i] == res[j]) {
                    i--;
                }
            }
        }
        return res;
    }


    public static String reversString(String str) {
        char[] array = str.toCharArray();
        String output = "";
        for (int i = array.length - 1; i >= 0; i--) {
            output += array[i];
        }
        return output;
    }
}
