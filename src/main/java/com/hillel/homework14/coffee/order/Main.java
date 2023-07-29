package com.hillel.homework14.coffee.order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();

        coffeeOrderBoard.add("John");
        coffeeOrderBoard.add("July");
        coffeeOrderBoard.add("Dan");

        coffeeOrderBoard.deliver();

        coffeeOrderBoard.add("Tirion");
        coffeeOrderBoard.add("Dobby");

        coffeeOrderBoard.deliver(3);
        coffeeOrderBoard.deliver(13);

        coffeeOrderBoard.deliver();

        coffeeOrderBoard.add("Marta");
        coffeeOrderBoard.add("Melissa");

        coffeeOrderBoard.draw();
    }
}
