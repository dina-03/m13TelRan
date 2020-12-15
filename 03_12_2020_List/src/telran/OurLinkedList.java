package telran;

import java.util.Iterator;
import java.util.LinkedList;

public class OurLinkedList<T> implements OurList<T> {

    Node<T> first;
    Node<T> last;
    int size;

    private static class Node<T> {
        Node<T> next;
        Node<T> prev;
        T element;

        public Node(Node<T> next, Node<T> prev, T element) {
            this.next = next;
            this.prev = prev;
            this.element = element;
        }

        public Node() {
        }

    } // class Node<T> ended

    @Override
    public void addLast(T element) {
        Node<T> node = new Node<>(null, last, element);
        if (size == 0) {
            //Node<T> node = new Node<>(null, null, element);
            first = last = node;
        } else {
            //Node<T> node = new Node<>(null, last, element);
            last.next = node;
            last = node;
        }
        size++;
    }

    @Override
    public T get(int index) { // O(n)
        Node<T> needle = getNodeByIndex(index);
        return needle.element;
    }

    @Override
    public void set(int index, T value) { //O(n)
        Node<T> needle = getNodeByIndex(index);
        needle.element = value;
    }

    private Node<T> getNodeByIndex(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        Node<T> res = first;
        for (int i = 0; i < index; i++) {
            res = res.next;
        }
        return res;
    }

    @Override
    public T removeById(int index) { //O(n)
        Node<T> res = getNodeByIndex(index);
        if (index == 0) {
            res = first;
            first = first.next;
            first.prev = null;
            size--;
            return res.element;
        }
        if (index == size - 1) {
            res = last;
            last = last.prev;
            last.next = null;
            size--;
            return res.element;
        }
        res.prev.next = res.next;
        res.next.prev = res.prev;
        size--;
        return res.element;
    }

    @Override
    public int size() { //O(1)
        return size;
    }

    @Override
    public void clear() {
        for (Node<T> node = first; node != null; ) {
            Node<T> next = node.next;
            node.element = null;
            node.next = null;
            node.prev = null;
            node = next;
        }
        last = first = null;
        size = 0;
    }

    @Override
    public boolean remove(T obj) { //O(n)
        if (obj.equals(first.element)) {
            first = first.next;
            first.prev = null;
            size--;
            return true;
        }
        if (obj.equals(last.element)) {
            last = last.prev;
            last.next = null;
            size--;
            return true;
        }
        for (Node<T> node = first.next; node != null; node = node.next) {
            if (obj.equals(node.element)) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean contains(T obj) { //O(n)

        if (obj == null) {
            for (Node<T> node = first; node != null; node = node.next) {
                if (node.element == null) {
                    return true;
                }
            }
            return false;
        }
        for (Node<T> node = first; node != null; node = node.next) {
            if (obj.equals(node.element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Iterator<T> forwardIterator() {
        return new ForwardIterator();
    }

    @Override
    public Iterator<T> backwardIterator() {
        return new BackwardIterator();
    }

    @Override
    public Iterator<T> iterator() {
        return forwardIterator();
    }

    private class ForwardIterator implements Iterator<T> {

        Node<T> currentNode = first;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (currentNode == null)
                throw new IndexOutOfBoundsException();

            T res = currentNode.element;
            currentNode = currentNode.next;
            return res;
        }
    }

    private class BackwardIterator implements Iterator<T> {

        Node<T> currentNode = last;

        @Override
        public boolean hasNext() {
            return currentNode != null;
        }

        @Override
        public T next() {
            if (currentNode == null)
                throw new IndexOutOfBoundsException();

            T res = currentNode.element;
            currentNode = currentNode.prev;
            return res;
        }
    }
}
