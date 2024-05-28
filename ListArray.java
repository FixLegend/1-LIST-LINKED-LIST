package p;

public class ListArray<T> implements TDAList<T> {
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        @SuppressWarnings("unchecked")
        T element = (T) array[index];
        return element;
    }
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public ListArray() {
        this.array = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }
    private void ensureCapacity(int minCapacity) {
        int oldCapacity = array.length;
        if (minCapacity > oldCapacity) {
            int newCapacity = oldCapacity * 2;
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
        }
    }
    @Override
    public boolean isEmptyList() {
        return size == 0;
    }
    @Override
    public int length() {
        return size;
    }
    @Override
    public void destroyList() {
        for (int i = 0; i < size; i++) {
            array[i] = null;
        }
        size = 0;
    }
    @Override
    public int search(T x) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(x)) {
                return i;
            }
        }
        return -1;
    }
    @Override
    public void insertFirst(T x) {
        ensureCapacity(size + 1);
        System.arraycopy(array, 0, array, 1, size);
        array[0] = x;
        size++;
    }
    @Override
    public void insertLast(T x) {
        ensureCapacity(size + 1);
        array[size++] = x;
    }
    @Override
    public void removeNode(T x) {
        int index = search(x);
        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            array[size - 1] = null;
            size--;
        }
    }
}




