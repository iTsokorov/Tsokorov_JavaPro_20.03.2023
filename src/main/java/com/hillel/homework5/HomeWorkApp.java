package com.hillel.homework5;

public class HomeWorkApp {
    public static void main(String[] args) {
    checkSumSign();
    printColor();
    compareNumbers();
    System.out.println(sumBetweenNumbers(6, 6));
    numberIsPositive(-3);
    System.out.println(numberIsNegative(15));
    printString("Bull", 3);
    System.out.println(yearIsLeap(400));

    }
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = 10;
        int b = 20;

        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Sum is positive.");
        } else {
            System.out.println("Sum is negative.");
        }
    }

    public static void printColor() {
        int value = 111;

        if (value <= 0) {
            System.out.println("Red");
        } if (value > 0 && value <= 100) {
            System.out.println("Yellow");
        } if (value > 100) {
            System.out.println("Green");
        }
    }

    public static void compareNumbers() {
        int a = 8;
        int b = 5;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean sumBetweenNumbers(int a, int b) {
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void numberIsPositive(int a) {
        if (a >= 0) {
            System.out.println("This number is positive.");
        } else {
            System.out.println("This number is negative.");
        }
    }

    public static boolean numberIsNegative(int a) {
        if (a >= 0) {
            return  false;
        } else {
            return true;
        }
    }

    public static void printString (String str, int a) {

        for (int i = 0; i < a; i++) {
            System.out.println(str);
        }
    }
    public static boolean yearIsLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
