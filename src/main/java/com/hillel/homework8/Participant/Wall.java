package com.hillel.homework8.Participant;

public class Wall extends Obstacle {
    @Override
    public void overcome(Participant participant) {
        participant.jump(3);
    }
}
