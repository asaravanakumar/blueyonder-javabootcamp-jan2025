package com.labs.java.io;

import com.labs.java.collection.Order;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileImportExportService {

    private Map<Integer, Order> orders = new HashMap<>();

    public void fileImport() {
        System.out.println("Importing order details...");
        try {
            Scanner in = new Scanner(new FileInputStream("input/order-input1.txt"));

            while(in.hasNextLine()) {
                System.out.println(in.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error while importing the file. " + e.getMessage());
        }
    }

    public void fileExport() {
        System.out.println("Exporting order details into a file...");
    }
}
