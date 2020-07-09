package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Thread t1 = new Thread(new Process("T1"));
        Thread t2 = new Thread(new Process("T2"));
        Thread t3 = new Thread(new Process("T3"));
        Thread t4 = new Thread(new Process("T4"));
        Thread t5 = new Thread(new Process("T5"));
/*
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
*/
        //---------------------------------------------------------

        // creating 3 threads
        ThreadJoining tj1 = new ThreadJoining();
        ThreadJoining tj2 = new ThreadJoining();
        ThreadJoining tj3 = new ThreadJoining();

        // thread t1 starts
        tj1.start();

        // starts second thread after when
        // first thread t1 has died.
        try {
            System.out.println("Main: Current Thread: " + Thread.currentThread().getName());
            tj1.join();
        } catch(Exception e) {}

        // t2 starts
        tj2.start();

        // starts t3 after when thread t2 has died.
        try {
            System.out.println("Main: Current Thread: " + Thread.currentThread().getName());
            tj2.join();
        } catch(Exception e) {}

        tj3.start();
        System.out.println("Main: Current Thread: " + Thread.currentThread().getName() + " The End");
    }
}
