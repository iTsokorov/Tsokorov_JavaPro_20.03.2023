package com.hillel.homework8.Participant;

public class Cat extends Participant {

    protected Cat(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        System.out.println("Cat " + getName() + " is running.");
    }

    @Override
    public void jump(int height) {
        System.out.println("Cat " + getName() + " is jumping.");
    }

    @Override
    public int getMaxLength() {
        return 3;
    }

    @Override
    public int getMaxHeight() {
        return 5;
    }
}
