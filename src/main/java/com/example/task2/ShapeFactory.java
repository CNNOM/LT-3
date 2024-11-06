package com.example.task2;

import javafx.scene.paint.Color;

public class ShapeFactory {
    public Shape createShape(int numberOfSides) {

        switch (numberOfSides) {
            case 0:
                return new Circle(100, Color.GRAY);
            case 1:
                return new Triangle(100, Color.RED);
            case 2:
                return new Square(100, Color.GREEN);
            case 3:
                return new Pentagon(100, Color.YELLOW);
            default:
                return null;
        }
    }
}