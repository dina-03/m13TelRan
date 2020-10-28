package de.telran;

import de.telran.robot.BigHead;
import de.telran.robot.Head;
import de.telran.robot.Robot;
import de.telran.robot.SmallHead;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Box<T> {
    private T t;

    public void setT(T t) {
        this.t = t;
    }

    public <S> void run(S number){
        System.out.println("T: " + t.getClass().getSimpleName());
        System.out.println("Number: " + number.getClass().getSimpleName());
        System.out.println(number.toString());
    }

    public <S extends Head> void runHead(S head){
        System.out.println("T: " + t.getClass().getSimpleName());
        System.out.println("Head: " + head.getClass().getSimpleName());
        System.out.println(head.toString());
    }

   // public void run1(Robot<?> robot){ }
    public void run1(Robot<? extends Head> robot){
        robot.getHead().getClass().getSimpleName();
    }

    public static void main(String[] args) {
        /*List<? extends Number> list1; //реализация листа с типом данных расширяющая Number
        List<? super Integer> list = new ArrayList<>(); //для всех объектов Integer
       // list.add(12,11);*/

        List<Number> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        print(list);
        print2(list1);

       /* Box<String> box = new Box<>();
        box.setT("hello");
        box.run(12.56);

        Box<Integer> box1 = new Box<>();
        box1.setT(10);
        box1.run(30);

        Box<String> headBox = new Box<>();
        headBox.setT("hello");
        headBox.runHead(new BigHead());*/
    }

    public static void print(List<? extends Number> list1){
        System.out.println(list1);
    }

    public static void print2(List<? super Integer> list2){
        System.out.println(list2);
    }
}
