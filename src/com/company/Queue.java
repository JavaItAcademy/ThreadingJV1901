package com.company;

public class Queue {
    public static void main(String[] args) throws InterruptedException {
        String[] people1 = new String[10];
        String[] people2 = new String[10];
        for(int i = 0; i < people1.length; i++) {
            people1[i] = "A:" + i;
        }
        for(int i = 0; i < people2.length; i++) {
            people2[i] = "B:" + i;
        }
        Thread t1 = new Thread(new ThreadQ(people1));
        Thread t2 = new Thread(new ThreadQ(people2));
        Thread t3 = new Thread();
        t3.start();
        t1.setName("QUEUE1");
        t2.setName("QUEUE2");
        t1.start();
        t2.start();
        System.out.println("ENDING MAIN");

    }
}

