package de.telran;

import java.util.Comparator;
import java.util.Iterator;

public class OurTreeMap<K, V> implements OurMap<K, V> {

    private static class Node<K, V> {
        Node<K, V> left;
        Node<K, V> right;
        Node<K, V> parent;
        K key;
        V value;

        public Node(K key, V value, Node<K, V> parent) {
            this.key = key;
            this.value = value;
            this.parent = parent;
        }
    }

    private final Comparator<K> keyComparator;
    private Node<K, V> root;
    private int size;

    public OurTreeMap(Comparator<K> keyComparator) {
        this.keyComparator = keyComparator;
    }

    /**
     * if we use this constructor in the client code, that mean that the keys are Comparable
     * если мы используем этот конструктор в клиентском коде, то это означает, что ключи сравнимы
     */
    public OurTreeMap() {
        this.keyComparator = new Comparator<K>() {
            @Override
            public int compare(K o1, K o2) {
                Comparable<K> comparable01 = (Comparable<K>) o1;
                return comparable01.compareTo(o2);
            }
        };
    }

    @Override
    public V put(K key, V value) {
        Node<K, V> node = new Node<>(key, value, null);
        if (root == null) {
            root = node;
            return null;
        }

        Node<K, V> parent = root;

        return null;
    }

    @Override
    public V get(K key) {
        return null;
    }

    @Override
    public V remove(K key) {
        return null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator keyIterator() {
        return null;
    }

    @Override
    public Iterator valueIterator() {
        return null;
    }
}
