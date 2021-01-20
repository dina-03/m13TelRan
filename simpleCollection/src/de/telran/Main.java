package de.telran;

public class Main {

    public static void main(String[] args) {
        int[] x = {1, 3, 5, 7, 9, 11};
        for (int it : x) {
            ++it;
            System.out.print(it + " ");
        }
    }
}
