package com.hillel.homework8.Participant;

public class Human extends Participant {

    protected Human(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        System.out.println("Human " + getName() + " is running.");
    }

    @Override
    public void jump(int height) {
        System.out.println("Humena " + getName() + "is jumping.");
    }
}
