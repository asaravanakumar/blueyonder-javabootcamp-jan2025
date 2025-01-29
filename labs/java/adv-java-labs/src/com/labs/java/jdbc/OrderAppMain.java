package com.labs.java.jdbc;

import com.labs.java.collection.OrderServiceHashSetImpl;

import java.util.Collection;
import java.util.Iterator;

public class OrderAppMain {
    public static void main(String[] args) {

//        OrderService orderService = new OrderServiceArrListImpl();
        OrderService orderService = new OrderServiceImpl();

        Order order1 = new Order("Lenovo ThinkPad", "Laptop", 10, 75000.0);
        Order order2 = new Order("iPhone 16", "Smartphone", 5, 60000.0);


        // 1. Create Orders
        System.out.println("\n 1. Create Orders");
        orderService.createOrder(order1);
        orderService.createOrder(order2);

        // 2. List Orders
        System.out.println("\n 2. List Orders");
        Collection<Order> orders = orderService.getAllOrders();

        Iterator<Order> it = orders.iterator();
        // Show order details
        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // 3. View Order
        System.out.println("\n 3. View Order");
        int orderId = 1;
        System.out.println("Viewing Order ID - " + orderId);
        System.out.println(orderService.getOrder(orderId));

        // 4. Update Order
        System.out.println("\n 4. Update Order");
        System.out.println("Updating Order ID - " + orderId);
        Order order1Updated = order1.clone();
        order1Updated.setPrice(80000.0);

        orderService.updateOrder(orderId, order1Updated);

        System.out.println(orderService.getOrder(orderId));

        // 5. Delete Order
        System.out.println("\n 5. Delete Order");
        System.out.println("Delete Order ID - " + orderId);

        orderService.deleteOrder(orderId);

        for(Order order: orderService.getAllOrders()) {
            System.out.println(order);
        }

    }
}
