package com.labs.java.record;

public class OrderRecordMain {
    public static void main(String[] args) {
        OrderRecord orderRecord = new OrderRecord(123, "Lenovo ThinkPad", "Laptop", 10, 75000.0);
        System.out.println(orderRecord.id() + " " + orderRecord.name() + " " + orderRecord.category() + " " + orderRecord.quantity() + " " + orderRecord.price()  );
        System.out.println(orderRecord);
    }
}
