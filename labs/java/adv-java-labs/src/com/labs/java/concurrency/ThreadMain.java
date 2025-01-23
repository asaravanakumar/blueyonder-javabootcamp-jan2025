package com.labs.java.concurrency;

public class ThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName()  + " - Before PrinterThread creation");

        PrinterThread t1 = new PrinterThread();
//        System.out.println(t1.getState().name());
        t1.start(); // register the thread for scheduling

        PrinterThread t2 = new PrinterThread();
        t2.start();

        PrinterThread t3 = new PrinterThread();
        t3.start();

        System.out.println(Thread.currentThread().getName() + " - After PrinterThread creation");

        try {
            Thread.sleep(1000 * 60 * 5);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
