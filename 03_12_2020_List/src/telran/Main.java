package telran;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 2, 7, 9, 23, 90};
        OurArrayList<String> strings = new OurArrayList<>();
        //ArrayList anotherString = (ArrayList) strings; // down casting это преобразование

        // strings.addLast("Vasya");
        strings.addLast(Integer.toString(4));
        strings.addLast(Integer.toString(15));
        strings.addLast(Integer.toString(6));
        strings.addLast(Integer.toString(9));
        strings.addLast(Integer.toString(19));

        //
        /* Iterator<String> forwardIterator = strings.new ForwardIterator();*/
        Iterator<String> forwardIterator = strings.forwardIterator();
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + "; ");
        }

       /* String str1 = (String) strings.get(0);
        String str2 = (String) strings.get(1);

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strings.size(); i++) {
            res.append(strings.get(i));
        }*/
        System.out.println();
        //static nested class
        Iterator<String> backwardIterator = strings.backwardIterator();
        while (backwardIterator.hasNext()) {
            System.out.print(backwardIterator.next() + "; ");
        }

        //Iterable
        for (String str : strings) {
            System.out.println(str);
        }
        //equivalent to:
        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()) {
            String str = stringIterator.next();
            System.out.println(str);
        }
    }
}
