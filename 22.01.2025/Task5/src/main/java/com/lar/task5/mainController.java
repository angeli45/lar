package com.lar.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private Label rez;

    @FXML
    private TextField setX;

    @FXML
    private TextField setY;

    @FXML
    void BTNonAction(ActionEvent event) {
        double x = Double.parseDouble(setX.getText());
        double y = Double.parseDouble(setY.getText());
        if (pow(x, 2) + pow(y, 2) < pow(10,2) && y > -x) {
            rez.setText("Да");
        }else if (pow(x, 2) + pow(y, 2) > 10 && y < -x)
            rez.setText("Нет");
        else rez.setText("На границе");
    }

}
