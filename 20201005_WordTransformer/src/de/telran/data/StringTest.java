package de.telran.data;

public class StringTest {
    public static void main(String[] args) {
        printString("I always do my homework");
        System.out.println();
        System.out.println("_______");
        printString2("I always do my homework");
    }

    public static void printString(String input) {
        System.out.print("[");
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') {
                System.out.print(input.charAt(i));
            } else {
                System.out.print("]\n[");
            }
        }
        System.out.print("]");
    }

    public static void printString2(String input) {
        System.out.print("[");
        for (int i = 0; i < input.length(); i++) {
            System.out.print((input.charAt(i) != ' ') ? input.charAt(i) : "]\n[");
        }
        System.out.print("]");
    }
}
