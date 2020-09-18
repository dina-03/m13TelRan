package de.telran;

public class Main {
    public static void main(String[] args) {
       /* int[] numbers = {1, 2, 3, 5, 6, 8, 9, 12, 15, 23, 32, 35};
        int res = binarySearch(numbers, 12);
        System.out.println(res >= 0 ? "index of 12 is " + res : "no such number in array");*/
        displayOddNumber(13);
        displayEvenNumber(13);
    }

    private static void displayEvenNumber(int number) {
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }

    private static void displayOddNumber(int number) {
        int count = 0;
        while (count <= number){
           if (count % 2 != 0){
               if (count == number){
                   System.out.println(count);
               }else {
                   System.out.print(count + ", ");
               }
           }
            count++;
        }
    }

    private static int binarySearch(int[] numbers, int number) {
        int left, right, middle;
        for (left = 0, right = numbers.length - 1; left <= right; ) {
            middle = (left + right) / 2;
            if (numbers[middle] == number) {
                return middle;
            } else if (numbers[middle] > number) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }
        return -1;
    }

}
