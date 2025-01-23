package com.labs.java.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadCallableMain {
    public static void main(String[] args) {

        // STEP1: Create ThreadPool
//        ExecutorService es = Executors.newFixedThreadPool(10);
//        ExecutorService es = Executors.newSingleThreadExecutor();
        ExecutorService es = Executors.newCachedThreadPool();

//        // STEP2: Create Tasks
//        PrinterTask t1 = new PrinterTask();
//        PrinterTask t2 = new PrinterTask();
//        PrinterTask t3 = new PrinterTask();
//
//        // STEP3: Submit Tasks
//        Future<String> f1 = es.submit(t1);
//        Future<String> f2 = es.submit(t2);
//        Future<String> f3 = es.submit(t3);
//
//        // STEP4: Check Status
//        while(!f1.isDone() || !f2.isDone() || !f3.isDone() ) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("Waiting for response...");
//        }
//
//        // STEP5: Print Output
//        try {
//            System.out.println(f1.get());
//            System.out.println(f2.get());
//            System.out.println(f3.get());
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }

        List<Future> futureList = new ArrayList<>();
        for(int i=0; i<10; i++) {
            PrinterTask t = new PrinterTask();
            Future f = es.submit(t);
//            futureList.add(f);
            try {
                System.out.println(f.get());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (ExecutionException e) {
                throw new RuntimeException(e);
            }
        }

//        for(Future f: futureList) {
//            try {
//                System.out.println(f.get());
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//        }

        // STEP6: Shutdown ThreadPool
        es.shutdown();

    }
}
