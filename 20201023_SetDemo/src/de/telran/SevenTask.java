package de.telran;

import java.util.*;

public class SevenTask<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public Node<E> getFirst() {
        return first;
    }

    public Node<E> getLast() {
        return last;
    }
    static class Node<E>{
        E value;
        Node next;
        Node prev;
    }
    public void revers(Node num) {
        if (num.next != null){
            revers(num.next);
        }
        System.out.println(num.prev);
    }
}
