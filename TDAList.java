package p;

public interface TDAList<T> {
    boolean isEmptyList();
    int length();
    void destroyList();
    int search(T x);
    void insertFirst(T x);
    void insertLast(T x);
    void removeNode(T x);
	T get(int index);
}
