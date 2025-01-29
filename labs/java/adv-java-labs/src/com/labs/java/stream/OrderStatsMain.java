package com.labs.java.stream;

import com.labs.java.collection.Order;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class OrderStatsMain {

    public static void main(String[] args) {
        Order order1 = new Order(101,"Lenovo ThinkPad", "Laptop", 10, 75000.0);
        Order order2 = new Order(102,"iPhone 16", "Smartphone", 5, 60000.0);
        Order order3 = new Order(103,"Samsung Galaxy", "Smartphone", 10, 50000.0);
        Order order4 = new Order(104,"Office Chairs", "Furniture", 5, 10000.0);
        Order order5 = new Order(105,"Meeting Tables", "Furniture", 10, 20000.0);
        Order order6 = new Order(106,"Conference Phones", "Phones", 5, 30000.0);

        Map<Integer, Order> orders = new HashMap<>();
        orders.put(order1.getId(), order1);
        orders.put(order2.getId(), order2);
        orders.put(order3.getId(), order3);
        orders.put(order4.getId(), order4);
        orders.put(order5.getId(), order5);
        orders.put(order6.getId(), order6);


        System.out.println(orders);

        // a. Show list of Order IDs belongs to particular Category
        List<Integer> orderIds = orders.values()
                .stream() // creating stream
                .filter(OrderStatsMain::checkOrder)
                .map(Order::getId)
                .toList(); // .toCollect(Collectors.toList())

        System.out.println(orderIds);

//        b. Show Order Category wise Count
        Map<String,Long> categoryWiseCount = orders.values()
                .stream()
                .collect(Collectors.groupingBy(Order::getCategory, TreeMap::new, Collectors.counting()));

        System.out.println(categoryWiseCount);

//        c. Show Order Category wise Total Amount
        Map<String,Double> categoryWiseTotAmt = orders.values()
                .stream()
                .collect(Collectors.groupingBy(Order::getCategory, TreeMap::new, Collectors.summingDouble(Order::getPrice)));
        System.out.println(categoryWiseTotAmt);

        //        d. Show Order Category wise Avg Amount
        Map<String,Double> categoryWiseAvgAmt = orders.values()
                .stream()
                .collect(Collectors.groupingBy(Order::getCategory, TreeMap::new, Collectors.averagingDouble(Order::getPrice)));
        System.out.println(categoryWiseAvgAmt);

        //        e. Show List of Categories whose Avg Amount >= 30k

        orders.values()
                .stream()
                .collect(Collectors.groupingBy(Order::getCategory, TreeMap::new, Collectors.averagingDouble(Order::getPrice)))

                .entrySet()
                .stream()
                .filter(e -> e.getValue() >= 30000)
                .map(Map.Entry::getKey)
                .toList()
                .forEach(System.out::println);


    }

    private static boolean checkOrder(Order order) {
        return order.getCategory().equals("Furniture");
    }
}
