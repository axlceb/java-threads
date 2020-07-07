package com.company;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Process implements Runnable {

    private String name;
    private int time;
    Random r = new Random();

    private static int count;

    public Process (String name) {
        this.name = name;
        this.time = r.nextInt(999);
        System.out.printf("The thread %s is created. Interval %d\n", this.name, this.time);
    }

    private synchronized void increment() {
        Process.count++;
    }

    @Override
    public void run() {
        Timer timer = new Timer();
        int begin = 0;
        timer.schedule(new TimerTask() {
            int counter = 0;
            @Override
            public void run() {
                counter++;
                System.out.printf("Thread %s runs counter: %d\n", name, this.counter);

                System.out.printf("Thread %s Count: %d\n", name, Process.count);
                increment();
                System.out.printf("Thread %s Count: %d\n", name, Process.count);

                if (counter >= 10){
                    timer.cancel();
                }
            }
        }, begin, time);
    }
}
