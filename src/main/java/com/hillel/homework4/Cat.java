package com.hillel.homework4;

public class Cat extends Animals{
    String name;
    private static int catCounter = 0;

    public Cat() {
        catCounter++;
    }

    public static int getCatCounter() {
        return catCounter;
    }

    public Cat(String name) {
        this.name = name;
        catCounter++;
    }

    @Override
    public void run(int distance) {
        if (distance > 200) {
            System.out.println(getName() + " can't run bigger than 200 m.");
        } else if(distance < 1) {
            System.out.println(getName() + " is still standing.");
        } else {
            System.out.println(getName() + " run " + distance + " m.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(getName() + " can't swim.");
    }

    public String getName() {
        return name;
    }
}
