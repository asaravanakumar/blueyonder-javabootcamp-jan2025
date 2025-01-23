package com.labs.java.concurrency;

public class PrinterRunnableThread implements Runnable{

    @Override
    public void run() {
            PrinterChildThread r2 = new PrinterChildThread();
            Thread t2 = new Thread(r2);
            t2.start();

            try {
                t2.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

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
