package org.kodluyoruz;

public interface Queue<T> {
    T poll();

    void add(T value);

    T peek();
}
