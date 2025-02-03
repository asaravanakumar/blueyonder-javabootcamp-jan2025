package com.labs.java.record;

// Final immutable class
public record OrderRecord(int id, String description, String category, int quantity, double price)  {
}
