package com.labs.java.generic;

import com.labs.java.collection.Order;

import java.util.Arrays;

public class GenericSorter {

    // TODO: Create Generic method to sort the given data
    public static <T extends Comparable> void sort(T[] input) {
        // TODO: Sorting logic
        Arrays.sort(input);
        for (T item: input) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] intArr = {100,50,40,200};
        String[] strArr = {"Anil","Akhil","Sunil","Kunal"};

        Order order1 = new Order("Lenovo ThinkPad", "Laptop", 10, 75000.0);
        Order order2 = new Order("iPhone 16", "Smartphone", 5, 60000.0);
        Order[] orderArr = {order1, order2};

        System.out.println("\n Sort Numbers");
        sort(intArr);

        System.out.println("\n Sort String");
        sort(strArr);

        System.out.println("\n Sort Objects");
        sort(orderArr);


    }
}
