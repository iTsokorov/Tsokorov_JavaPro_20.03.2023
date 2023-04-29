package com.hillel.homework8.Participant;

public abstract class Participant {

    protected Participant(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    public abstract void run(int distance);

    public abstract void jump(int height);
}
