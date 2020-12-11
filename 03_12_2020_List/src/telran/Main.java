package telran;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] array = {5, 2, 7, 9, 23, 90};
        OurArrayList<String> strings = new OurArrayList<>();
        //ArrayList anotherString = (ArrayList) strings; // down casting это преобразование

       strings.addLast("Vasya");
        strings.addLast(Integer.toString(4));
        strings.addLast(Integer.toString(15));
        strings.addLast(Integer.toString(6));
        strings.addLast(Integer.toString(9));
        strings.addLast(Integer.toString(19));

        //
        /* Iterator<String> forwardIterator = strings.new ForwardIterator();
        Iterator<String> forwardIterator = strings.forwardIterator();
        while (forwardIterator.hasNext()) {
            System.out.print(forwardIterator.next() + "; ");
        }

        String str1 = (String) strings.get(0);
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

        //Iterable - что-то что можно перебрать
        for (String str : strings) {
            System.out.println(str);
        }
        //equivalent to:
        Iterator<String> stringIterator = strings.iterator();
        while (stringIterator.hasNext()) {
            String str = stringIterator.next();
            System.out.println(str);
        }
        LinkedList<Integer> linkedList = new LinkedList<>();
        if (strings.contains("Vasya")){
            System.out.println("здесь был Вася!");
        }else {
            System.out.println("здесь таких нет!!!");
        }

        System.out.println();

        OurLinkedList<String> list = new OurLinkedList<>();
        list.addLast("Sonya");
        list.addLast("Tonya");
        list.addLast("Danna");
        list.addLast("Jana");
        if (list.contains("Danna")){
            System.out.println("Здесь была Яна");
        }else {
            System.out.println("Здесь никого нет!!!");
        }

        System.out.println(list.size);
        list.clear();
        System.out.println(list.size);

        System.out.println("---------");

    }
}
