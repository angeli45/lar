package com.lar.doptask3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField ATextField;

    @FXML
    private Button BTN;

    @FXML
    private TextField BTextField;

    @FXML
    private Label RezultLable;

    @FXML
    void BTNonAction(ActionEvent event) {
        int a = Integer.parseInt(ATextField.getText());
        int b = Integer.parseInt(BTextField.getText());
        while (b != 0) {
            int Nod = b;
            b = a % b;
            a = Nod;
        }
        RezultLable.setText(String.valueOf(a));
    }

}
