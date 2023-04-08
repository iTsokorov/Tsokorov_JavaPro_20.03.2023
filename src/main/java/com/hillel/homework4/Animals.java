package com.hillel.homework4;


public class Animals {
    String type;
    private static int animalCounter = 0;


    public Animals(String type) {
        this.type = type;
        animalCounter++;
    }
    public Animals() {
        animalCounter++;
    }
    public static int getAnimalCount() {
        return animalCounter;
    }

    public void run(int distance) {
        if (distance < 1) {
            System.out.println(getType() +  " is still standing.");
        } else {
            System.out.println(getType() + " run " + distance + " m.");
        }
    }

    public void swim(int distance) {
        if (distance < 1) {
            System.out.println(getType() +  " is still standing.");
        } else {
            System.out.println(getType() + " swim " + distance + " m.");
        }
    }

    public String getType() {
        return type;
    }
}
