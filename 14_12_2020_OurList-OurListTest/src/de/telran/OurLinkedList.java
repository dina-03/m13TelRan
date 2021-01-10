package de.telran;

import java.util.Comparator;
import java.util.Iterator;

public class OurLinkedList<T> implements OurList<T> {
    Node<T> first;// null
    Node<T> last;// null
    int size;// 0

    private static class Node<T> {
        Node<T> next;
        Node<T> prev;
        T element;

        public Node(Node<T> next, Node<T> prev, T element) {
            this.next = next;
            this.prev = prev;
            this.element = element;
        }
    }

    @Override
    public void addLast(T element) {
        Node<T> node = new Node<>(null, last, element);
        if (size == 0) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
        size++;
    }

    @Override
    public T get(int index) {
        Node<T> needle = getNodeByIndex(index);
        return needle.element;
    }

    @Override
    public void set(int index, T value) {
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
    public T removeById(int index) {
        Node<T> needle = getNodeByIndex(index);

        return removeNode(needle);
    }

    private T removeNode(Node<T> needle) {
        Node<T> before = needle.prev;
        Node<T> after = needle.next;

        if (before != null) {
            before.next = after;
        } else {
            first = after;
        }

        if (after != null) {
            after.prev = before;
        } else {
            last = before;
        }

        //clear the removing element
        needle.prev = needle.next = null;
        T res = needle.element;
        needle.element = null;

        size--;
        return res;
    }

    @Override
    public boolean remove(T obj) {
        Node<T> needle = findByElement(obj);

        if (needle == null)
            return false;

        removeNode(needle);
        return true;
    }

    private Node<T> findByElement(T obj) {
        Node<T> res = first;
        if (obj == null) {
//            for (int i = 0; i < size; i++)
            while (res != null) {
                if (res.element == null)
                    return res;

                res = res.next;
            }
        } else {
            while (res != null) {
                if (obj.equals(res.element))
                    return res;

                res = res.next;
            }
        }

        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        first = last = null;
        size = 0;
    }

    @Override
    public boolean contains(T obj) {
        return findByElement(obj) != null;
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

    /*@Override
    public int sort(Comparator<T> comparator) {
        Object[] copy = new Object[size];
        int i = 0;
        for (T elt : this) {
            copy[i++] = elt;
        }

       *//* for (int j = 0; j < copy.length; j++) {
            for (int k = 1; k < (copy.length - j); k++) {
                if (comparator.compare(getNodeByIndex(k - 1).element, getNodeByIndex(k).element) > 0) {
                    Object temp = copy[k - 1];
                    copy[k - 1] = copy[k];
                    copy[k] = temp;
                }
            }
        }*//*

        for (int j = 0; j < size; j++) {
            int minId = j;
            for (int k = j; k < size; k++) {
                if (comparator.compare((T) copy[minId], (T) copy[k]) > 0) {
                    minId = k;
                }
            }
            Object temp = copy[j];
            copy[j] = copy[minId];
            copy[minId] = temp;
        }

        this.clear();
        for (Object elt : copy) {
            this.addLast((T) elt);
        }
        return i;
    }

    @Override
    public T max(Comparator<T> comparator) {
        return null;
    }

    @Override
    public T min(Comparator<T> comparator) {
        return null;
    }*/
}
