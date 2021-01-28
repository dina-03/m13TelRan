package de.telran;

import de.telran.map.OurTreeMap;

import java.util.Iterator;
import java.util.TreeMap;

public class OurTreeSet<T> implements OurSet<T>{

    OurTreeMap<T, Object> source = new OurTreeMap<>();
    private final Object stubValue = new Object();

    @Override
    public boolean add(T elt) {
        return source.put(elt, stubValue) == null;
    }

    @Override
    public boolean remove(T elt) {
        return source.put(elt, stubValue) != null;
    }

    @Override
    public boolean contains(T elt) {
        return source.containsKey(elt);
    }

    @Override
    public int size() {
        return source.size();
    }

    @Override
    public void addAll(OurSet<T> another) {
        for (T t : another) {
            this.add(t);
        }
    }

    @Override
    public void retainAll(OurSet<T> another) {
        OurSet<T> temp = new OurTreeSet<>();
        for (T t : this) {
            if (!another.contains(t))
                temp.add(t);
        }
        this.removeAll(temp);
    }

    @Override
    public void removeAll(OurSet<T> another) {
        for (T t : another) {
            this.remove(t);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return source.keyIterator();
    }
}
