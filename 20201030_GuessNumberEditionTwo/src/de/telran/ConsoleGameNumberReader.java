package de.telran;

import java.util.Scanner;

public class ConsoleGameNumberReader implements GameNumberReader{
    Scanner scanner = new Scanner(System.in);
    @Override
    public int getGuessedNumber() {
        return scanner.nextInt();
    }

    public Scanner getScanner() {
        return scanner;
    }
}
