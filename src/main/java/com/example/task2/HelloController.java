package com.example.task2;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.canvas.Canvas;

public class HelloController {
    @FXML
    private TextField inputField;

    @FXML
    private Canvas drawingCanvas;

    @FXML
    public void addPikcher() {
        GraphicsContext gc = drawingCanvas.getGraphicsContext2D();

        if (!checkWithRegExp(inputField.getText()) || inputField.getText().equals("")) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);

            alert.setTitle("Предупреждение: ");
            alert.setHeaderText(null);
            alert.setContentText("Введено нечисло или число не из диапазона от 0 до 3!");
            alert.showAndWait();

        } else {
            int numberOfSides = Integer.parseInt(inputField.getText());
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape = shapeFactory.createShape(numberOfSides);
//            gc.clearRect(0, 0, drawingCanvas.getWidth(), drawingCanvas.getHeight());
            if (shape != null) {
                shape.draw(gc);
            }
            inputField.clear();
        }
    }

    private boolean checkWithRegExp(String input) {
        return input.matches("[0-3]");
    }
}