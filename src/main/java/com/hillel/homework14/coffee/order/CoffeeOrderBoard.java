package com.hillel.homework14.coffee.order;

import java.util.*;

public class CoffeeOrderBoard {
    Map <Integer, Order> orders = new HashMap<>();
    private int nextOrderNumber = 1;

    public void add(String costumerName) {
        Order order = new Order(nextOrderNumber, costumerName);
        orders.put(nextOrderNumber,order);
        nextOrderNumber++;
    }
    public void deliver() {
        if (orders.isEmpty()) {
            return;
        }

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(orders.keySet());
        int minOrderNumber = priorityQueue.poll();
        System.out.println("Order " + minOrderNumber + " ready to deliver!");
        orders.remove(minOrderNumber);
    }

    public void deliver(int orderNumber) {
        if(!orders.containsKey(orderNumber)) {
            System.out.println("There isn't order number " + orderNumber + "!");
        } else {
            System.out.println("Order " + orderNumber + " ready to deliver!");
        }
        orders.remove(orderNumber);
    }

    public void draw() {
        System.out.println("=====================");
        System.out.println("Num | Name");
        for (Map.Entry<Integer, Order> entry : orders.entrySet()) {
            int orderNumber = entry.getKey();
            String customerName = entry.getValue().getCustomerName();
            System.out.println(orderNumber + " | " + customerName);
        }
        System.out.println("=====================");
    }

    @Override
    public String toString() {
        return "Orders: " + orders;
    }
}
