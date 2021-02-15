package de.telran;

public class Main {

    public static void main(String[] args) {
        numbersCountWithOne(3, 31);
        //numbers(3, 33);
    }

    public static void numbersCountWithOne(int a, int b) {
        char one = '1';
        int res = numbers(a, b);
        String num = Integer.toString(res);

    }

    public static int numbers(int a, int b) {
        for (int i = a; i <= b; i++) {
            // System.out.print(i + ", ");
        }
        return a;
    }
}
