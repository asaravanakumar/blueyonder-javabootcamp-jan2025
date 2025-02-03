package com.labs.orderapp.dao;

import com.labs.orderapp.model.Order;
import com.labs.orderapp.util.DbConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class OrderDaoJdbcImpl implements OrderDao {

    private Connection conn = null;
    private Statement stmt = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;

    public OrderDaoJdbcImpl() {
        conn = DbConnection.getConnection();
    }

    @Override
    public int createOrder(Order order) {
        // TODO: Insert order details into db
        String sql = "INSERT INTO ORDERS (description,category,quantity,price) VALUES (?,?,?,?)";
        int count = 0;
        try {
            pstmt = conn.prepareStatement(sql);

            pstmt.setString(1,order.getDescription());
            pstmt.setString(2,order.getCategory());
            pstmt.setInt(3,order.getQuantity());
            pstmt.setDouble(4,order.getPrice());

            count = pstmt.executeUpdate();

            System.out.println(count > 0 ? "Order inserted successfully." : "Order insertion failed.");
        } catch (SQLException e) {
            System.out.println("Error while inserting the order. " + e.getMessage());
        } finally {
            try {
                pstmt.close();
            } catch (SQLException e) {
                System.out.println("Error while closing the Prepared Statement");
            }
        }
        return count;
    }

    @Override
    public Collection<Order> getAllOrders() {
        String sql = "SELECT * FROM orders";
        List<Order> orders = new ArrayList<>();
        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                Order order = new Order();
                order.setId(rs.getInt("id"));
                order.setDescription(rs.getString("description"));
                order.setCategory(rs.getString("category"));
                order.setQuantity(rs.getInt("quantity"));
                order.setPrice(rs.getDouble("price"));
                orders.add(order);
            }
        } catch (SQLException e) {
            System.out.println("Error while fetching the orders. " + e.getMessage());
        } finally {
            try {
                rs.close();
                pstmt.close();
            } catch (SQLException e) {
                System.out.println("Error while closing the Prepared Statement or ResultSet");
            }
        }

        return orders;
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
