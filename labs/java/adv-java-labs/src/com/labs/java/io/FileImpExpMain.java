package com.labs.java.io;

import com.labs.java.collection.Order;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileImpExpMain {
    public static void main(String[] args) {

        // 1. File Import
        // 2. File Export
        // 3. Exit

        Scanner in = new Scanner(System.in);

        FileImportExportService impExp = new FileImportExportService();

        while(true) {

            System.out.println("1. File Import");
            System.out.println("2. File Export");
            System.out.println("3. Exit");

            System.out.print("Enter the option: ");
            int option = in.nextInt();

            switch (option) {
                case 1:
                    impExp.fileImport();
                    break;
                case 2:
                    impExp.fileExport();
                    break;
                case 3:
                    System.out.println("Thank you!!!");
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
