package com.lar.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private TextField NTextField;

    @FXML
    private Label RezultLable;

    @FXML
    void BTNonAction(ActionEvent event) {
        int n = Integer.parseInt(NTextField.getText());
        if (n > 0) {
            double e = getFac(n);
            double rez = getFac(e);
            RezultLable.setText(String.valueOf(rez));
        } else RezultLable.setText("Неправильное число");

    }

    public static double getFac(double f) {
        double r = 1;
        for (int i = 1; i <= f; i++) {
            r = r * i;
        }
    return r;
    }

}

