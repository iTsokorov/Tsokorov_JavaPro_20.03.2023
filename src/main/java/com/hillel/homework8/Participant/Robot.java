package com.hillel.homework8.Participant;

public class Robot extends Participant {

    protected Robot(String name) {
        super(name);
    }

    @Override
    public void run(int distance) {
        System.out.println("Robot " + getName() + "is running.");
    }

    @Override
    public void jump(int height) {
        System.out.println("Robot " + getName() + "is jumping.");
    }

    @Override
    public int getMaxLength() {
        return 3;
    }

    @Override
    public int getMaxHeight() {
        return 1;
    }
}
