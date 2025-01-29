package com.labs.java.jdbc;

import java.util.Collection;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    OrderDao orderDao = new OrderDaoJdbcImpl();

    @Override
    public int createOrder(Order order) {
        return orderDao.createOrder(order);
    }

    @Override
    public Collection<Order> getAllOrders() {
        return orderDao.getAllOrders();
    }

    @Override
    public Order getOrder(int id) {
        return null;
    }

    @Override
    public boolean updateOrder(int id, Order order) {
        return false;
    }

    @Override
    public boolean deleteOrder(int id) {
        return false;
    }
}
