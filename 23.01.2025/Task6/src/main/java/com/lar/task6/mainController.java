package com.lar.task6;

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
        if (n % 5 == 0) RezultLable.setText("true");
        else RezultLable.setText("false");
    }

}
