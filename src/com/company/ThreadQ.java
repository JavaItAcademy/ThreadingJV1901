package com.company;

public class ThreadQ implements Runnable {
    String[] people;

    public ThreadQ(String[] people) {
        this.people = people;
    }

    @Override
    public void run() {
        for(String i : people) {
            System.out.println("Processed: " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
