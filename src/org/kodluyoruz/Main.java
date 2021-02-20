package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
        QueueImp<Integer> myQuery = new QueueImp<>();
        AddThread thread1 = new AddThread(myQuery, 50);
        AddThread thread2 = new AddThread(myQuery, 150);
        AddThread thread3 = new AddThread(myQuery, 95);
        PeekThread thread4 = new PeekThread(myQuery);
        PollThread thread5 = new PollThread(myQuery);
        PollThread thread6 = new PollThread(myQuery);
        PollThread thread7 = new PollThread(myQuery);
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
        thread6.start();
        thread7.start();

        QueueImp<String> myStringQuery = new QueueImp<>();
        AddThread thread8 = new AddThread(myStringQuery, "Hello1");
        AddThread thread9 = new AddThread(myStringQuery, "Hello2");
        AddThread thread10 = new AddThread(myStringQuery, "Hello3");
        PeekThread thread11 = new PeekThread(myStringQuery);
        PollThread thread12 = new PollThread(myStringQuery);
        PollThread thread13 = new PollThread(myStringQuery);
        PollThread thread14 = new PollThread(myStringQuery);
        thread8.start();
        thread9.start();
        thread10.start();
        thread11.start();
        thread12.start();
        thread13.start();
        thread14.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
            thread4.join();
            thread5.join();
            thread6.join();
            thread7.join();
            thread8.join();
            thread9.join();
            thread10.join();
            thread11.join();
            thread12.join();
            thread13.join();
            thread14.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread is interrupted");
        }
    }
}
