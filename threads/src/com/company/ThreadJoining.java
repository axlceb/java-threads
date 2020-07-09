package com.company;

public class ThreadJoining extends Thread {
    @Override
    public void run() {
        System.out.println("ThreadJoining: Thread: " + Thread.currentThread().getName() + " - Started");
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(500);
            } catch(Exception e) {}
            System.out.println("ThreadJoining: Thread: " + Thread.currentThread().getName() + ". i="+ i);
        }
    }
}