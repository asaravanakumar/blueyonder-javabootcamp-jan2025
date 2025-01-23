package com.labs.java.concurrency;

public class PrinterThread extends Thread {

    @Override
    public void run() {

        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
