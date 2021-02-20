package org.kodluyoruz;

public class AddThread<T> extends Thread {

    QueueImp<T> queueImp;
    T value;

    public AddThread(QueueImp<T> queueImp, T value) {
        this.queueImp = queueImp;
        this.value = value;
    }

    @Override
    public void run() {
        queueImp.add(value);
        System.out.println("Add: " +value);
    }
}
