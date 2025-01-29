package com.labs.java.jdbc;

import java.util.Collection;

public interface OrderService {

    public int createOrder(Order order);

    public Collection<Order> getAllOrders();

    public Order getOrder(int id);

    public boolean updateOrder(int id, Order order);

    public boolean deleteOrder(int id);
}
