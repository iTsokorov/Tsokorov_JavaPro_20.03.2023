package com.hillel.homework8.Participant;

public class RaceTrack extends Obstacle {
    @Override
    public void overcome(Participant participant) {
        participant.run(3);
    }
}
