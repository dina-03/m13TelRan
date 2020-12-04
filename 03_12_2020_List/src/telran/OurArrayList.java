package telran;

public class OurArrayList<T> implements OurList<T> {
    private static final int INITIAL_CAPACITY = 16;
    private int size;
    Object[] source;

    public OurArrayList() {
        source = new Object[INITIAL_CAPACITY];
    }

    @Override
    public void addLast(T element) {
        if (size == source.length) {
            increaseCapacity();
        }//source[size++] = element;
        source[size] = element;
        size++;
    }

    void increaseCapacity() {
        int newCapacity = source.length * 2;
        Object[] newSource = new Object[newCapacity];
        System.arraycopy(source, 0, newSource, 0, source.length);
        source = newSource;
    }

    @Override
    public T get(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        return (T) source[index];
    }

    @Override
    public void set(int index, T value) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        source[index] = value;
    }

    @Override
    public T removeById(int index) {
        if (index >= size || index < 0)
            throw new IndexOutOfBoundsException();
        T resRemove = (T) source[index];
        System.arraycopy(source, index + 1, source, index, size - index - 1);
        source[size -1] = null;
        size--;
        return resRemove;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void clear() {
        source = new Object[INITIAL_CAPACITY];
        size = 0;
    }

    @Override
    public boolean remove() {
        return false;
    }

    @Override
    public boolean contains(T obj) {

        return false;
    }
}
