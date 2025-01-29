package com.labs.java.concurrency;

import com.labs.java.collection.Order;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConcurrentFileImportExportService {

    private Map<Integer, Order> orders = new HashMap<>();

    public synchronized void fileImport() {
        System.out.println("Importing order details...");
        try {
            Scanner in = new Scanner(new FileInputStream("input/order-input.txt"));


            while (in.hasNextLine()) {
                String strOrder = in.nextLine();
                String[] tokens = strOrder.split(",");

                Order order = new Order();
                order.setId(Integer.parseInt(tokens[0]));
                order.setDescription(tokens[1]);
                order.setCategory(tokens[2]);
                order.setQuantity(Integer.parseInt(tokens[3]));
                order.setPrice(Double.parseDouble(tokens[4]));

                orders.put(order.getId(), order);
            }

            for (Order order : orders.values()) {
                System.out.println(order);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error while importing the file. " + e.getMessage());
        }
    }

    public synchronized void fileExport() {
        System.out.println("Exporting order details into a file...");
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new FileWriter("output/order-output.txt", true));


            for (Order order : orders.values()) {
                StringBuilder orderRecord = new StringBuilder();
                orderRecord.append(order.getId()).append(",")
                        .append(order.getDescription()).append(",")
                        .append(order.getCategory()).append(",")
                        .append(order.getQuantity()).append(",")
                        .append(order.getPrice());

                out.write(orderRecord.toString());
                out.newLine();
            }

            out.flush();
            System.out.println("Orders Exported Successfully!!!");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
