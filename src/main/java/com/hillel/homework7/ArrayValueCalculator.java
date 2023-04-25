package com.hillel.homework7;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        try {
            int sum = doCalc(arr);
            System.out.println("Sum of array values: " + sum);
        } catch (ArraySizeException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (ArrayDataException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }

    public static int doCalc(String[][] arr) throws ArraySizeException, ArrayDataException {
        if (arr.length != 4 || arr[0].length != 4 || arr[1].length != 4 || arr[2].length != 4 || arr[3].length != 4) {
            throw new ArraySizeException("Input array must be 4x4");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Invalid data in cell [" + i + "][" + j + "]: " + arr[i][j], e);
                }
            }
        }
        return sum;

    }
}
