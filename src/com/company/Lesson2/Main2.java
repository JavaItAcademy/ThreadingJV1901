package com.company.Lesson2;

public class Main2 {
    public volatile static int place = 1;
    static  Object lock = new Object();
    public static void main(String[] args) {
        Thread r1 = new Thread(new Racer(), "1");
        Thread r2 = new Thread(new Racer(), "2");
        Thread r3 = new Thread(new Racer(), "3");
        Thread r4 = new Thread(new Racer(), "4");
        Thread r5 = new Thread(new Racer(), "5");

        r1.start();
        r2.start();
        r3.start();
        r4.start();
        r5.start();
        synchronized (lock) {
            System.out.println("IN synchronizeed: " + Thread.currentThread().getName());
        }
    }


}
