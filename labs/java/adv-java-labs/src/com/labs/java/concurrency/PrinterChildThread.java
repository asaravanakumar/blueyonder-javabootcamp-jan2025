package com.labs.java.concurrency;

public class PrinterChildThread implements Runnable{
    @Override
    public void run() {
        for(int i=1; i<=10; i++) {
            System.out.println(Thread.currentThread().getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread Interrupted - " + e.getMessage());
                throw new RuntimeException(e);
            }
        }
    }
}
