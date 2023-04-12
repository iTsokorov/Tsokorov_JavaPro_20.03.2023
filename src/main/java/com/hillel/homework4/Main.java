package com.hillel.homework4;

public class Main {
    public static void main(String[] args) {

        Animal animal1 = new Animal("Horse");
        animal1.run(30);
        animal1.swim(100);
        System.out.println(Animal.getAnimalCount());

        Cat cat1 = new Cat("Marsel");
        cat1.run(250);

        cat1.swim(10);
        System.out.println(Cat.getCatCounter());

        Dog dog1 = new Dog("Gav");
        dog1.run(444);
        dog1.swim(7);
        System.out.println(Dog.getDogCounter());
    }
}
