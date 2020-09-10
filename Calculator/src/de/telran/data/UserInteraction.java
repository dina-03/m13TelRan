package de.telran.data;
import java.util.Scanner;
public class UserInteraction {
    private static Scanner scanner = new Scanner(System.in);

    public static double getParameter() {
        System.out.println("Enter number, please ");
        return scanner.nextDouble();
    }

    public static char operation() {
        System.out.println("Enter operation symbol, please");
        char operation = scanner.next().charAt(0);
        while (operation != '+' && operation != '-' && operation != '*' && operation != '/') {
            System.out.println("wrong operation symbol, enter new please");
            operation = scanner.next().charAt(0);
        }
        return operation;
    }

    public static double getRightDelimiter(double b){
        while (b == 0){
            System.out.println("Error, enter another number");
            b = scanner.nextDouble();
        }
        return b;
    }
    public static void closeScanner(){
        scanner.close();
    }
}
