package org.kodluyoruz;

public class Main {

    public static void main(String[] args) {
            QueueImp<Integer> myQuery = new QueueImp<>();
            myQuery.add(50);
            myQuery.add(150);
            myQuery.add(95);
            System.out.println(myQuery.peek());
            System.out.println(myQuery.poll());
            System.out.println(myQuery.poll());
            System.out.println(myQuery.poll());


            System.out.println("---------------------------");
            QueueImp<String> myStringQuery = new QueueImp<>();
            myStringQuery.add("Hello1");
            myStringQuery.add("Hello2");
            myStringQuery.add("Hello3");
            System.out.println(myStringQuery.peek());
            System.out.println(myStringQuery.poll());
            System.out.println(myStringQuery.poll());
            System.out.println(myStringQuery.poll());
            System.out.println(myStringQuery.poll());

        }
}
