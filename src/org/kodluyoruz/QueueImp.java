package org.kodluyoruz;

public class QueueImp<T> implements Queue<T> {
    private Node<T> first;
    private Node<T> last;

    @Override
    public void add(T value) {
        Node<T> old = last;
        last = new Node<>();
        last.setValue(value);
        last.setNext(null);
        if (first==null){
            first=last;
        }
        else {
            old.setNext(last);
        }
    }

    @Override
    public T peek() {
        return first!=null ? first.getValue() : null;
    }

    @Override
    public T poll() {
        T value = null;
        if (first!=null) {
            value = first.getValue();
            first = first.getNext();
        }
        return value;

    }

    public Node<T> getFirst() {
        return first;
    }

    public void setFirst(Node<T> first) {
        this.first = first;
    }

    public Node<T> getLast() {
        return last;
    }

    public void setLast(Node<T> last) {
        this.last = last;
    }
}
