package com.example.task2;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Square implements Shape {
    private double side;
    private Color color;
    private double strokeWidth;
    private Color strokeColor;
    private double x;
    private double y;

    public Square(double side, Color color) {
        this.side = side;
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
        gc.fillRect(x, y, side, side);
        gc.strokeRect(x, y, side, side);
    }

    @Override
    public void descriptor() {
        System.out.println("Квадрат");
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

}