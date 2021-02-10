package de.telran;

import java.util.Arrays;

public class SolutionMissingNumber {

    public int solve(int[] numbers) {
        int n = numbers.length + 1;
        int completeSum = n * (n + 1) / 2;
        int incompleteSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            incompleteSum += numbers[i];
        }
        return completeSum - incompleteSum;
    }

    public void findExtraNumber(int numbers, int size) {
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

    public int[] randomArrayWithoutADuplicate(int numbers, int size) {
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

}
