package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        Thread t1 = new Thread(new Process("T1"));
        Thread t2 = new Thread(new Process("T2"));
        Thread t3 = new Thread(new Process("T3"));
        Thread t4 = new Thread(new Process("T4"));
        Thread t5 = new Thread(new Process("T5"));

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
