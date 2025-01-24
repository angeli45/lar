package ru.lar.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.pow;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private TextField NTextField;

    @FXML
    private Label Rezult;


    @FXML
    void BTNonAction(ActionEvent event) {
        int n = Integer.parseInt(NTextField.getText());
        double u, v = 0;
        double u1 = 0, u2 = 0;
        double v1 = 1, v2 = 1;
        for (int i = 3; i <= n; i++){
            u = u2 - u1 * v2 - v1 / (1 + pow(u2, 2) + pow(v2, 2));
            v = u2 - v2 / (Math.abs(u1 + v2) + 2);
            u1 = u2;
            u2 = u;
            v1 = v2;
            v2 = v;
        }
        Rezult.setText(String.valueOf(v));
    }

}
