package de.telran;

import de.telran.map.OurHashMap;
import java.util.HashSet;
import java.util.Iterator;

public class OurHashSet<T> implements OurSet<T> {

    private final OurHashMap<T, Object> source;
    private final Object stubValue = new Object();

    public OurHashSet() {
        source = new OurHashMap<>();
    }

    @Override
    public boolean add(T elt) {
        return source.put(elt, stubValue) == null;
    }

    @Override
    public boolean remove(T elt) {
        return source.remove(elt) != null;
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
        OurSet<T> temp = new OurHashSet<>();
        for (T t : this) {
            if (!another.contains(t))
                temp.add(t);
        }
        this.removeAll(temp);
    }

    @Override
    public void removeAll(OurSet<T> another) {
        for (T t : another) {
            remove(t);
        }
    }

    @Override
    public Iterator<T> iterator() {
        return source.keyIterator();
    }
}
