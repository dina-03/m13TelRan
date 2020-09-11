package de.telran.application;

import static de.telran.data.ScannerProjectArray.fillArray;
import static de.telran.data.ScannerProjectArray.isDeleteNumberInArray;
import static de.telran.data.UserInteraction.*;

public class MainScanner {

    public static void main(String[] args) {

        int arraySize = getArraySize();
        int[] myArray = new int[arraySize];
        fillArray(myArray);

        int deleteNumber = getDeletedNumber();
        boolean checkNumber = isDeleteNumberInArray(myArray, deleteNumber);
        printResult(myArray, checkNumber, deleteNumber);
        closeScanner();
    }
}
