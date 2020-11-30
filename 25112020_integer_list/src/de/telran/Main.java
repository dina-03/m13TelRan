package de.telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // int[] array = new int[10];
        // System.out.println(array[10]);

        /*List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println(Arrays.toString(list1.toArray()));
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);
        System.out.println(Arrays.toString(list2.toArray()));*/

        /*try {
            list.get(10);
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }*/
        // System.out.println("After try");
        IntegerList list1 = new ArrayIntegerList();
        IntegerList list2 = new ArrayIntegerList();
        list1.addLast(1);
        list1.addLast(2);
        list1.addLast(3);

        list2.addLast(-1);
        list2.addLast(-2);
        list2.addLast(-3);

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i) + " ");
        }

        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i) + " ");
        }

        ArrayList<Integer> javaList =new  ArrayList<>();

    }
}
