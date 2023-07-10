package com.hillel.homework11;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        List<Apple> appleList = new ArrayList<>();
        appleList.add(apple);

        Box<Apple> appleBox1 = new Box<>();
        appleBox1.addFruit(apple);
        appleBox1.addFruit(apple);

        Box<Apple> appleBox2 = new Box<>();
        appleBox2.addFruits(appleList);
        System.out.println(appleBox2.getWeight());
        System.out.println(appleBox1.getWeight());

        Orange orange = new Orange();
        List<Orange> orangeList = new ArrayList<>();
        orangeList.add(orange);

        Box<Orange> orangeBox1 = new Box<>();
        orangeBox1.addFruit(orange);
        orangeBox1.addFruit(orange);

        Box<Orange> orangeBox2 = new Box<>();
        orangeBox2.addFruits(orangeList);
        System.out.println(orangeBox2.getWeight());
        System.out.println(orangeBox1.getWeight());

        System.out.println(appleBox1.compare(orangeBox1));


    }
    public static class ArrayToListConverter {
        public static <T> List <T> toList (T[] array){
                List<T> list = new ArrayList<>();
                for (T element : array) {
                    list.add(element);
                }
                return list;

        }


    }
}
