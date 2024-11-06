package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Circle implements Shape {
    private double radius;
    private Color color;
    private double strokeWidth;
    private Color strokeColor;
    private double x;
    private double y;

    public Circle(double radius, Color color) {
        this.radius = radius;
        this.color = color;
        this.strokeWidth = 1;
        this.strokeColor = Color.BLACK;
        this.x = 100;
        this.y = 100;
    }

    @Override
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.setStroke(strokeColor);
        gc.setLineWidth(strokeWidth);
        gc.fillOval(x, y, radius * 2, radius * 2);
        gc.strokeOval(x, y, radius * 2, radius * 2);
    }

    @Override
    public void descriptor() {
        System.out.println("Круг");
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

}