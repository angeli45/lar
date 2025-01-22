package com.lar.task4;

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
    private TextField setx;

    @FXML
    void BTNonAction(ActionEvent event) {
        double x = Double.parseDouble(setx.getText());
        double y;
        if (x >= 1) {
            y = x * (pow(x, 4) + 3 * x) + log(PI + x);
        } else if (x < 0) {
            y = pow(x, 5) - 10 - pow(PI + x, 1.0 / 4);
        } else y = pow(pow(x, 3) + 3, 3) - sqrt(0.5 * PI + x);

        rez.setText("y = " + y);
    }

}
