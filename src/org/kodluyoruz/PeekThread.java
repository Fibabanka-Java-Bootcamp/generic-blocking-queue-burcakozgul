package org.kodluyoruz;

public class PeekThread<T> extends Thread{

    QueueImp<T> queueImp;

    public PeekThread(QueueImp<T> queueImp) {
        this.queueImp = queueImp;
    }

    @Override
    public void run() {
        System.out.println("Peek: "+queueImp.peek());
    }
}
