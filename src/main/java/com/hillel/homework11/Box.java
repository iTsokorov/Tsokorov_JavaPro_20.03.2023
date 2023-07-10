package com.hillel.homework11;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Box<T extends Fruit> {
    private Set<T> fruits;

    public Box() {
        fruits = new HashSet<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public void addFruits(List<T> fruits) {
        fruits.addAll(fruits);

    }

    public float getWeight() {
        float weight = 0.0f;
        for (T fruit : fruits) {
            if (fruit instanceof Apple) {
                weight += 1.0f;
            } else if (fruit instanceof Orange) {
                weight += 1.5f;
            }
        }
        return weight;
    }

    public boolean compare(Box<? extends Fruit> otherBox) {
        if (this.getWeight() == otherBox.getWeight()) {
            System.out.println("Weight of boxes is similar");
            return true;
        } else {
            System.out.println("Weight of boxes is different");
            return false;
        }
    }

    public void merge(Box<T> otherBox) {
        if (this.getClass() == otherBox.getClass()) {
            fruits.addAll(otherBox.fruits);
            otherBox.fruits.clear();
        } else {
            System.out.println("Cannot merge boxes with different types of fruits.");
        }
    }
}
