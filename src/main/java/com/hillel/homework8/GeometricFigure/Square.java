package com.hillel.homework8.GeometricFigure;

public class Square implements GeometricFigure {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double areaGeometricFigure() {
        return side * side;
    }
}
