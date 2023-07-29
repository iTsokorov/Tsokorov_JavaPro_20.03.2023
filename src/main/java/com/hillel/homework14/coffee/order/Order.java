package com.hillel.homework14.coffee.order;

import java.util.HashMap;
import java.util.Map;

public class Order {
    private int orderNumber;
    private String customerName;

    public Order(int orderNumber, String customerName) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return customerName;
    }
}
