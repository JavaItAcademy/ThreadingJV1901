package com.company.printer;

public class PrinterMain {
    public static void main(String[] args) {
        Thread t1 = new Thread(new PrinterRequest("1", 5));
        Thread t2 = new Thread(new PrinterRequest("2", 5));
        Thread t3 = new Thread(new PrinterRequest("3", 5));

        t1.start();
        t2.start();
        t3.start();
    }
}
