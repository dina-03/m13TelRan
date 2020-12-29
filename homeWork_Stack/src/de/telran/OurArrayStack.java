package de.telran;

public class OurArrayStack<T> implements OurStack{
    private int maxSize;
    private int[] stackArray;
    private int top;
    private int size;

    public OurArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stackArray = new int[maxSize];
        top = -1;
    }

    @Override
    public void addLast(int elt) {
        stackArray[++top] = elt;
    }

    @Override
    public Object removeLast() {
        return stackArray[top--];
    }

    @Override
    public Object getLast() {
        return stackArray[top];
    }

    @Override
    public int size() {
        return size;
    }

    public int getMax(){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < stackArray.length; i++) {
            max = Math.max(max,stackArray[i]);
        }
        return max;
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (top == maxSize - 1);
    }
}
