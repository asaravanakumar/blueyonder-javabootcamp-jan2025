package com.labs.orderapp.service;

import com.labs.orderapp.dao.OrderDao;
import com.labs.orderapp.dao.OrderDaoJdbcImpl;
import com.labs.orderapp.model.Order;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class OrderServiceImplTests {

    @Mock
    OrderDao orderDao;

    @InjectMocks
    OrderService orderService = new OrderServiceImpl();

    @BeforeAll
    public static void initialize() {
        Mockito.mockConstruction(OrderDaoJdbcImpl.class);
    }

    @Test
    public void givenValidDetails_whenCreateOrder_thenReturnOrderId() {
        Mockito.when(orderDao.createOrder(Mockito.any(Order.class))).thenReturn(1);

        Order order = new Order("Lenovo Thinkpad", "Laptop", 10, 75000.0);
        int id = orderService.createOrder(order);

        assertEquals(id, 1);
    }
}
