package de.telran.application;

import de.telran.data.Calculator;
import de.telran.data.UserInteraction;

import static de.telran.data.UserInteraction.getParameter;

import java.util.Scanner;

public class CalculatorApplication {
    public static void main(String[] args) {
        // Calculator.calculation(20,10,'/');
        double a = getParameter();
        double b = getParameter();
        char operation = UserInteraction.operation();
        Calculator.calculation(a, b, operation);
        UserInteraction.closeScanner();
    }
}
