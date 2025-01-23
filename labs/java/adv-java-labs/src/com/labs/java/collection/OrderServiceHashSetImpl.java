package com.labs.java.collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OrderServiceHashSetImpl implements OrderService{

    private Set<Order> orders = new HashSet<>();
    private static int ID;

    @Override
    public int createOrder(Order order) {
        order.setId(++ID);
        orders.add(order);
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
        for(Order ord: orders) {
            if(ord.getId() == id) {
                orders.remove(ord);
                break;
            }
        }
        return orders.add(order);
    }

    @Override
    public boolean deleteOrder(int id) {
        for(Order ord: orders) {
            if(ord.getId() == id) {
                orders.remove(ord);
                return true;
            }
        }
        return false;
    }
}
