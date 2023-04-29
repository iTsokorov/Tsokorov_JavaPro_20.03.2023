package com.hillel.homework8.Participant;

public class Main {
    public static void main(String[] args) {
        Obstacle[] obstacles = {new RaceTrack(), new Wall()};
        Participant[] participants = {
                new Cat("Lord"),
                new Human("Bob"),
                new Robot("Optimus")
        };
        for (Obstacle obstacle : obstacles) {
            for (Participant participant : participants) {
                obstacle.overcome(participant);
            }
        }
    }
}
