package org.kodluyoruz;

public class PollThread<T> extends Thread{

    QueueImp<T> queueImp;

    public PollThread(QueueImp<T> queueImp) {
        this.queueImp = queueImp;
    }

    @Override
    public void run() {
        System.out.println("Poll: "+queueImp.poll());
    }
}
