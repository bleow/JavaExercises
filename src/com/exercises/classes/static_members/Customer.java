package com.exercises.classes.static_members;

public class Customer {
    private final String customerId;
    private final String name;
    private final String address;
    public static int customerCount = 0;

    public Customer(String customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        customerCount++;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}