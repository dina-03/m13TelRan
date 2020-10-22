package de.telran;

public class CustomLinkedList<E> implements CustomList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    public Node<E> getFirst() {
        return first;
    }

    public Node<E> getLast() {
        return last;
    }
    //CustomLinkedList list = new CustomLinkedList();
    //{} first = null, last = null, size = 0;
    // {el(next = null, prev = null) first = el, last = null, size = 1}
    //e1(next = e2, prev = null), e2(next = null, prev = el), first = e1, last = e2, size = 2;

    private static class Node<E> {
        E value;
        Node next;
        Node prev;

        public Node(E value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }

        public E getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(E o) {
        if (size > 0) {
            Node<E> newNode = new Node<>(o, null, last);
            last.next = newNode;
            last = newNode;
        } else {
            Node<E> newNode = new Node<>(o, null, null);
            first = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }
        Node ret = getNode(index);
        return (E) ret.value;
    }

    private Node getNode(int index) {
        Node ret = first;   //[first] [second]
       // Node las = last;
        for (int i = 0; i < index; i++) {
            ret = ret.next;
          //  las = las.prev;
        }
        return ret;
    }

    @Override
    public E removeById(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0){
            first = first.next;
            first.prev = null;
            size--;
            return first.value;
        }

        if (index == size - 1){
            last = last.prev;
            last.next = null;
            size--;
            return last.value;
        }

        Node ret = getNode(index);
        ret.prev.next = ret.next;
        ret.next.prev = ret.prev;
        size--;
        return (E) ret.value;
    }

    @Override
    public boolean remove(E e) {
        if (e.equals(first.value)) {
            first = first.next;
            first.prev = null;
            size--;
            return true;
        }
        if (e.equals(last.value)) {
            last = last.prev;
            last.next = null;
            size--;
            return true;
        }
        for (Node node = first.next; node != null; node = node.next) {
            if (e.equals(node.value)) {
                node.prev.next = node.next;
                node.next.prev = node.prev;
                size--;
                return true;
            }
        }
        return false;
    }
}
