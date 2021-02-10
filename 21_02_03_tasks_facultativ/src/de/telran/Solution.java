package de.telran;

public class Solution {

    public String solve(String input) {
        char[] arr = input.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            char temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
        return new String(arr);
    }

    public String reversString(String str) {
        char[] array = str.toCharArray();
        String output = "";
        for (int i = array.length - 1; i >= 0; i--) {
            output += array[i];
        }
        return output;
    }

}
