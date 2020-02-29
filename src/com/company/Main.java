package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        FirstThread firstThread = new FirstThread();
        firstThread.start();
	    print("World", 10);
    }

    static void print(String text, int N) throws InterruptedException {
        for(int i = 0 ; i < N; i++) {
            System.out.println(text);
            Thread.sleep(1000);
        }
    }
}
