package de.telran;

public class Main {
    public static void main(String[] args) {
        OurArrayStack mStack = new OurArrayStack(5);
        mStack.addLast(22);
        mStack.addLast(25);
        mStack.addLast(45);
        mStack.addLast(38);
        mStack.addLast(105);
       // mStack.removeLast();
        System.out.println("Stack: ");
        while (!mStack.isEmpty()){
            Object value = mStack.removeLast();
            System.out.print(" " + value);
        }
        System.out.println();
        System.out.println("Max value: " + mStack.getMax());
    }
}
