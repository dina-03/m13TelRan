package de.telran.application;
import de.telran.data.ScannerProject;

import java.util.Scanner;

import static de.telran.data.ScannerProject.*;

public class MainScanner {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter size of array, please");
        int arraySize = scanner.nextInt();
        int[] myArray = new int[arraySize];
        fillArray(myArray);
        System.out.println("Enter number to delete");
        int deleteNumber = scanner.nextInt();
        boolean checkNumber = isDeleteNumberInArray(myArray, deleteNumber);
        printResult(myArray, checkNumber, deleteNumber);
        scanner.close();
    }
}
