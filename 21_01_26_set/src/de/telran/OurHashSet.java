package de.telran;

import de.telran.map.OurHashMap;
import java.util.Iterator;

public class OurHashSet<T> implements OurSet<T> {

    private OurHashMap<T, Object> source;
    private final Object stubValue = new Object();

    OurHashMap map = new OurHashMap();

    @Override
    public boolean add(T elt) {
        return map.put(elt, stubValue) == null;
    }

    @Override
    public boolean remove(T elt) {
        return map.remove(elt) == stubValue;
    }

    @Override
    public boolean contains(T elt) {
        return map.containsKey(elt);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public void addAll(OurSet<T> another) {

    }

    @Override
    public void retainAll(OurSet<T> another) {

    }

    @Override
    public void removeAll(OurSet<T> another) {

    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
