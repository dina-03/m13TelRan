package de.telran.data;

import java.util.Arrays;
import java.util.Scanner;

import static de.telran.data.ScannerProjectArray.getArrayWithoutDeleteNumber;

public class UserInteraction {
    static Scanner scanner = new Scanner(System.in);

    public static int getArraySize() {
        System.out.println("Enter size of array, please");
        return scanner.nextInt();
    }

    public static int getArrayElement() {
        System.out.println("Enter number, please");
        return scanner.nextInt();
    }

    public static int getDeletedNumber(){
        System.out.println("Enter number to delete");
        return scanner.nextInt();
    }

    public static void printResult(int[] numbers, boolean check, int number) {
        if (check) {
            System.out.println("Yes!");
            System.out.println(Arrays.toString(getArrayWithoutDeleteNumber(numbers, number)));
        } else {
            System.out.println("No.");
            System.out.println("Try again");
        }
    }

    public static void closeScanner() {
        scanner.close();
    }
}
