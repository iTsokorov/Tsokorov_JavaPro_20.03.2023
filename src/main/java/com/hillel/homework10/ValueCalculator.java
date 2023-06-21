package com.hillel.homework10;

public class ValueCalculator {

    private double[] arrayNumber;
    private int size;
    private int halfSize;

    public ValueCalculator(int size) {
        if (size < 1_000_000) {
            throw new IllegalArgumentException("Size should be at least 1,000,000");
        }
        this.size = size;
        this.halfSize = size / 2;
        this.arrayNumber = new double[size];
    }

    public int getSize() {
        return size;
    }

    public int getHalfSize() {
        return halfSize;
    }

    public void method() {
        long start = System.currentTimeMillis();

        for (int i = 0; i < size; i++) {
            arrayNumber[i] = 1.0;
        }

        double[] firstArray = new double[halfSize];
        double[] secondArray = new double[halfSize];
        System.arraycopy(arrayNumber, 0, firstArray, 0, halfSize);
        System.arraycopy(arrayNumber, halfSize, secondArray, 0, halfSize);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < firstArray.length; i++) {
                    firstArray[i] = (float) (firstArray[i] * Math.sin(0.2f + i / 5)
                            * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < secondArray.length; i++) {
                    secondArray[i] = (float) (secondArray[i] * Math.sin(0.2f + i / 5)
                            * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });

        thread1.start();
        thread2.start();

        System.arraycopy(firstArray, 0, arrayNumber, 0,halfSize);
        System.arraycopy(secondArray, 0, arrayNumber, halfSize, halfSize);


        long end = System.currentTimeMillis();
        long methodTime = end - start;
        System.out.println("Execution time of method: " + methodTime + " milliseconds");

    }
}
