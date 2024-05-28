package p;

public class ListLinked<T> implements TDAList<T> {
    protected Node<T> first;

    public ListLinked() {
        this.first = null;
    }

    @Override
    public boolean isEmptyList() {
        return first == null;
    }

    @Override
    public int length() {
        int count = 0;
        Node<T> current = first;
        while (current != null) {
            count++;
            current = current.getnext();
        }
        return count;
    }

    @Override
    public void destroyList() {
        first = null;
    }

    @Override
    public int search(T searchItem) {
        int index = 0;
        Node<T> current = first;
        while (current != null) {
            if (current.getData().equals(searchItem)) {
                return index;
            }
            current = current.getnext();
            index++;
        }
        return -1;
    }

    @Override
    public void insertFirst(T newItem) {
        Node<T> newNode = new Node<>(newItem);
        newNode.setNext1(first);
        first = newNode;
    }

    @Override
    public void insertLast(T newItem) {
        Node<T> newNode = new Node<>(newItem);
        if (isEmptyList()) {
            first = newNode;
        } else {
            Node<T> current = first;
            while (current.getnext() != null) {
                current = current.getnext();
            }
            current.setNext1(newNode);
        }
    }

    @Override
    public void removeNode(T deleteItem) {
        if (isEmptyList()) {
            return;
        }
        if (first.getData().equals(deleteItem)) {
            first = first.getnext();
            return;
        }
        Node<T> current = first;
        Node<T> previous = null;
        while (current != null && !current.getData().equals(deleteItem)) {
            previous = current;
            current = current.getnext();
        }
        if (current != null) {
            previous.setNext1(current.getnext());
        }
    }

    @Override
    public T get(int index) {
        if (index < 0 || index >= length()) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> current = first;
        for (int i = 0; i < index; i++) {
            current = current.getnext();
        }
        return current.getData();
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node<T> current = first;
        while (current != null) {
            result.append(current.getData()).append(" -> ");
            current = current.getnext();
        }
        result.append("null");
        return result.toString();
    }
}