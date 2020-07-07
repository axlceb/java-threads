package com.company;

import java.util.Random;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class Process implements Runnable {

    private String name;
    private int time;
    Random r = new Random();

    public Process (String name) {
        this.name = name;
        this.time = r.nextInt(999);
        System.out.printf("The thread %s is created. Interval %d\n", this.name, this.time);
    }

    @Override
    public void run() {
        Timer timer = new Timer();
        int begin = 0;
        timer.schedule(new TimerTask() {
            int counter = 0;
            @Override
            public void run() {
                System.out.printf("Thread %s runs counter: %d\n", name, this.counter);
                counter++;
                if (counter >= 10){
                    timer.cancel();
                }
            }
        }, begin, time);
    }
}
