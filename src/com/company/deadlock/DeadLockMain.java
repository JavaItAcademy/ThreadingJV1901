package com.company.deadlock;

public class DeadLockMain {
    public final static Object work = new Object();
    public final static Object experience= new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(new Work());
        Thread t2 = new Thread(new Experience());
        t1.start();
        t2.start();
        System.out.println("In main");
    }


}
class Work implements Runnable {

    @Override
    public void run() {
        synchronized (DeadLockMain.work){
            System.out.println("In Work");
            synchronized (DeadLockMain.experience){
                System.out.println("INSIDE");
            }
        }
    }
}

class Experience implements Runnable{

    @Override
    public void run() {
        synchronized (DeadLockMain.experience) {
            System.out.println("In experience");
            synchronized (DeadLockMain.work){
                System.out.println("INSIDE");
            }
        }
    }
}
