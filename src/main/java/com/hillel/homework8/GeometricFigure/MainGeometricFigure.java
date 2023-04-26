package com.hillel.homework8.GeometricFigure;

public class MainGeometricFigure {
    public static void main(String[] args) {
        GeometricFigure[] figures = new GeometricFigure[3];
        figures[0] = new Circle(3.5);
        figures[1] = new Triangle(3, 4);
        figures[2] = new Square(4);

        double totalArea = 0;

        for (GeometricFigure figure : figures) {
            totalArea += figure.areaGeometricFigure();
        }

    }
}
