package com.hillel.homework8.GeometricFigure;

public class Circle implements GeometricFigure {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double areaGeometricFigure() {
        return Math.PI * radius * radius;
    }
}
