package com.labs.java.concurrency;

import com.labs.java.io.FileImportExportService;

import java.util.Scanner;
import java.util.concurrent.*;

public class ConcurrentFileImpExpMain {
    public static void main(String[] args) {

        // 1. File Import
        // 2. File Export
        // 3. Exit

        Scanner in = new Scanner(System.in);

        FileImportExportService impExp = new FileImportExportService();

        ExecutorService es = Executors.newCachedThreadPool();

        Callable<String> importTask = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName() + " Importing Orders...");
                Thread.sleep(1000 * 120);
                impExp.fileImport();
                return "Orders Imported Successfully";
            }
        };

        Callable<String> exportTask = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(Thread.currentThread().getName() + " Exporting Orders...");
                Thread.sleep(1000 * 120);
                impExp.fileExport();
                return "Orders exported Successfully";
            }
        };


        while(true) {

            System.out.println("1. File Import");
            System.out.println("2. File Export");
            System.out.println("3. Exit");

            System.out.print("Enter the option: ");
            int option = in.nextInt();

            switch (option) {
                case 1:
                   Future<String> importFuture = es.submit(importTask);
                    System.out.println("Importing...");
//                    try {
//                        System.out.println(importFuture.get());
//                    } catch (InterruptedException e) {
//                        System.out.println("Error: " + e.getMessage());
//                    } catch (ExecutionException e) {
//                        System.out.println("Error: " + e.getMessage());
//                    }
                    break;
                case 2:
                    Future<String> exportFuture = es.submit(exportTask);
                    System.out.println("Exporting...");
//                    try {
//                        System.out.println(exportFuture.get());
//                    } catch (InterruptedException e) {
//                        System.out.println("Error: " + e.getMessage());
//                    } catch (ExecutionException e) {
//                        System.out.println("Error: " + e.getMessage());
//                    }
                    break;
                case 3:
                    System.out.println("Thank you!!!");
                    es.shutdown();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option.");
            }
            // OPTION 1: Import Order Details into orders Map and print
            // OPTION 2: Export Order Details from orders Map into a file

        }
    }
}
