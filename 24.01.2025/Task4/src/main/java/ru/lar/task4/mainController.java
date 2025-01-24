package ru.lar.task4;

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
    private TextField NTextField;

    @FXML
    private Label Rezult;

    @FXML
    private TextField XTextField;

    @FXML
    void BTNonAction(ActionEvent event) {
        int n = Integer.parseInt(NTextField.getText());
        int x = Integer.parseInt(XTextField.getText());
        double r = 1;
        for (int i = 1; i <= n; i++) {
            int t = 1;
            for (int j = 1; j <= i; j++) {
                t = t * j;
            }
            r = r + pow(x, i) / t;
        }
        if (r != 0) {
            Rezult.setText(String.valueOf(r));
        } else Rezult.setText("Что-то не так");
    }

}
