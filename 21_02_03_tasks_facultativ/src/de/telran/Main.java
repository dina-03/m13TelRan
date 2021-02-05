package de.telran;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(reversString("главрыба"));
        findExtraNumber(99, 100);
    }

    public static void findExtraNumber(int numbers, int size) {
        int sum = 0;
        int idx = -1;
        int[] arr = randomArrayWithoutADuplicate(numbers, size);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                idx = i;
            } else {
                sum += arr[i];
            }
        }
        int res = (arr.length + 1) * arr.length / 2;
        System.out.println("missing number is: " + (res - sum));
        System.out.println("arrays: " + Arrays.toString(arr));
    }

    public static int[] randomArrayWithoutADuplicate(int numbers, int size) {
        int[] res = new int[numbers];
        for (int i = 0; i < numbers; i++) {
            res[i] = (int) (Math.random() * size);
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
