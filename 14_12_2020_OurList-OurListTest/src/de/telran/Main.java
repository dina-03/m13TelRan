package de.telran;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        OurLinkedList<Integer> linkedList = new OurLinkedList();
        linkedList.addLast(10);
        linkedList.addLast(8);
        linkedList.addLast(22);
        linkedList.addLast(45);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        /*linkedList.sort(comparator);
        for (Integer i : linkedList) {
            System.out.print(i + " ");
        }*/
        System.out.println();
        System.out.println("-------");

        OurArrayList<Integer> arrayList = new OurArrayList<>();
        arrayList.addLast(2);
        arrayList.addLast(24);
        arrayList.addLast(13);
        arrayList.addLast(18);
        Comparator<Integer> comparator2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        arrayList.sort(comparator2);
        for (Integer in:arrayList) {
            System.out.print(in + " ");
        }
    }
}
