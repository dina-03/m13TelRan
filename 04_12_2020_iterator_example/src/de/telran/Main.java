package de.telran;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 12, 43, -12, -1};
        Iterator<Integer> simpleArrayIterator = new SimpleArrayIterator(array);
        Iterator<Integer> backwardArrayIterator = new BackwardArrayIterator(array);
        Iterator<Integer> increasingArrayIterator = new IncreasingArrayIterator(array);
        iterate(simpleArrayIterator);
        iterate(backwardArrayIterator);
        iterate(increasingArrayIterator);
        System.out.println(Arrays.toString(array));



       /* ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12, 11, 13, 1, 4, 5, 7, 8));
        ListIterator li = arr.listIterator(arr.size());
        while (li.hasPrevious()) {
            System.out.print(li.previous() + "; ");
        }
        System.out.println();
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(34, 24, 75, 74, 12, 98, 39, 47));
        System.out.println();
        int[] arraySort = {34, 24, 75, 74, 12, 98, 39, 47};
        //sortArrayBaIncreasing(arraySort);
        System.out.println(Arrays.toString(bubbleSortArrayByIncreasing(arraySort)));*/
    }

    static void iterate(Iterator<Integer> iterator) {
        while (iterator.hasNext()) {
            int current = iterator.next();
            System.out.print(current + "; ");
        }
        System.out.println();
    }

    public static int[] bubbleSortArrayByIncreasing(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                count++;
            }
        }
        if (count > 0)
            return bubbleSortArrayByIncreasing(arr);
        return arr;
    }
}
