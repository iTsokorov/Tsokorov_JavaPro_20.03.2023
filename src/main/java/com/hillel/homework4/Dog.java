package com.hillel.homework4;

public class Dog extends Animal {
    String name;
    private static int dogCounter = 0;

    public Dog() {
        dogCounter++;
    }

    public static int getDogCounter() {
        return dogCounter;
    }

    public Dog(String name) {
        this.name = name;
        dogCounter++;
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
        if (distance > 10) {
            System.out.println(getName() + " can't swim bigger than 10 m.");
        } else if(distance < 1) {
            System.out.println(getName() + " is still standing.");
        } else {
            System.out.println(getName() + " swim " + distance + " m.");
        }
    }

    public String getName() {
        return name;
    }
}
