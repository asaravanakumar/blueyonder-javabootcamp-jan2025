package com.labs.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderServiceArrListImpl implements OrderService{

    private List<Order> orders = new ArrayList<>();
    private static int ID = 0;

    @Override
    public int createOrder(Order order) {
        order.setId(++ID);
        orders.add(order);
        System.out.println("Order created successfully. Order ID - " + order.getId());
        return order.getId();
    }

    @Override
    public Collection<Order> getAllOrders() {
        return orders;
    }

    @Override
    public Order getOrder(int id) {
        for(Order order: orders) {
            if(order.getId() == id) {
                return order;
            }
        }
        return null;
    }

    @Override
    public boolean updateOrder(int id, Order order) {
        for(int i = 0; i < orders.size(); i++) {
            if(orders.get(i).getId() == id) {
                orders.set(i, order);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteOrder(int id) {
        for(int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if(order.getId() == id) {
                return orders.remove(order);
            }
        }
        return false;
    }
}
