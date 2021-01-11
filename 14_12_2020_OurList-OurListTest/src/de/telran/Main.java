package de.telran;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        OurLinkedList<Integer> linkedList = new OurLinkedList();
        linkedList.addLast(10);
        linkedList.addLast(8);
        linkedList.addLast(45);
        linkedList.addLast(22);
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        };
        linkedList.sort(comparator);
        for (Integer i : linkedList) {
            System.out.print(i + " ");
        }
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
        for (Integer in : arrayList) {
            System.out.print(in + " ");
        }
        System.out.println();
        System.out.println("-------");
        OurList<Integer> integerOurList = new OurArrayList<>();
        integerOurList.addLast(12);
        integerOurList.addLast(15);
        integerOurList.addLast(1);
        integerOurList.addLast(38);
        integerOurList.addLast(358);
        integerOurList.addLast(-8);
        for (Integer in : integerOurList) {
            System.out.print(in + " ");
        }
        System.out.println();
        System.out.println("min: " + integerOurList.min());
        System.out.println("max: " + integerOurList.max());
        integerOurList.sort();
        System.out.println("sort:");
        for (Integer in : integerOurList) {
            System.out.print(in + " ");
        }
    }
}
