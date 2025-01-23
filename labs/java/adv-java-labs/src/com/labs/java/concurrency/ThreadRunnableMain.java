package com.labs.java.concurrency;

public class ThreadRunnableMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName()  + " - Before PrinterThread creation");

        PrinterRunnableThread r1 = new PrinterRunnableThread();

        Thread t1 = new Thread(r1);
        t1.start();

        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//
//        Thread t2 = new Thread(r1);
//        t2.start();

//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        Thread t3 = new Thread(r1);
//        t3.start();



//        try {
//            Thread.sleep(1000 * 10);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        t1.interrupt();
//        t2.interrupt();
//        t3.interrupt();

        System.out.println(Thread.currentThread().getName()  + " - After PrinterThread creation");

    }
}
