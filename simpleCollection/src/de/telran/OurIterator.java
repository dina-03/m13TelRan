package de.telran;

import java.util.ArrayList;
import java.util.Iterator;

public class OurIterator {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(2);
        al.add(5);
        al.add(8);
        System.out.println(al);
        //с помощью итератора можем бегать по нашему списку
        Iterator<Integer> iterator = al.iterator();
        //спрашиваем есть ли следующий эле-нт в списке, если true, то будет реализованно
        while (iterator.hasNext()) {
            //переходим к следующему эл-ту в списке и его выводим
            Integer tmp = iterator.next();
            System.out.println(tmp);
        }
    }
}
