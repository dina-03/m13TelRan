package de.telran;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        StackMax stack = new StackMax();
        stack.addLast(2);
        stack.addLast(4);
        stack.addLast(6);
        stack.addLast(7);
        stack.addLast(18);
        System.out.println(stack.getMax());
    }
}
