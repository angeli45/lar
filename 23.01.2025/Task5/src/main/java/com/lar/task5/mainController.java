package com.lar.task5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private Label MesLable;

    @FXML
    private TextField NTextField;

    @FXML
    private Label VklLable;

    @FXML
    void BTNonAction(ActionEvent event) {
        int vkl = 1000;
        int p = Integer.parseInt(NTextField.getText());
        int s=vkl;
        int m = 0;
        if (0 < p && p < 25) {
            while (s <= 1100) {
                s = s + s * p / 100;
                m++;
            }
            MesLable.setText(String.valueOf(m));
            VklLable.setText(String.valueOf(s));
        } else {
            NTextField.setText("Неверный процент");
        }
    }

}
