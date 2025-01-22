package com.lar.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private Label result;

    @FXML
    void BTNonAction(ActionEvent event) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        if (n1>n2)
            result.setText(String.valueOf(n1));
        else
            result.setText(String.valueOf(n2));
    }

}
