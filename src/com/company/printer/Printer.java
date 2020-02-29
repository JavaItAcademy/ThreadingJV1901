package com.company.printer;

public class Printer {
    public static synchronized void print(String text, int N) throws InterruptedException {
        for (int i = 0; i < N; i++) {
            System.out.println(text);
            Thread.sleep(1000);
        }
    }
}
