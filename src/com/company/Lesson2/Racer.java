package com.company.Lesson2;

public class Racer implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ", place: " + Main2.place++);
        synchronized (Main2.class){
            System.out.println("IN synchronizeed: " + Thread.currentThread().getName());
        }
    }
}
