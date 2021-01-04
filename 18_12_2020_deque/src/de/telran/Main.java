package de.telran;

public class Main {

    public static void main(String[] args) {
	OurFixedArrayDeque<Integer> list = new OurFixedArrayDeque<>(4);
	list.addFirst(1);
	list.addFirst(2);
	list.addLast(4);
	list.addLast(8);
	list.removeFirst();
	list.removeLast();
        System.out.println("get first: " + list.getFirst());
        System.out.println("get last: " + list.getLast());
    }
}
