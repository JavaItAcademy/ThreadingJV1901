package com.company;

public class FirstThread extends Thread {
    @Override
    public void run() {
        try {
            print("Hello", 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void print(String text, int N) throws InterruptedException {
        for (int i = 0; i < N; i++) {
            System.out.println(text);
            Thread.sleep(1000);
        }
    }
}
