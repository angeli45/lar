package com.lar.task3;

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
    private Label max;

    @FXML
    private Label min;

    @FXML
    private TextField num1;

    @FXML
    private TextField num2;

    @FXML
    private TextField num3;

    @FXML
    void BTNonAction(ActionEvent event) {
        int n1 = Integer.parseInt(num1.getText());
        int n2 = Integer.parseInt(num2.getText());
        int n3 = Integer.parseInt(num3.getText());
        max.setText(String.valueOf(max(n1, max(n2, n3))));
        min.setText(String.valueOf(min(n1,min(n2,n3))));
    }

}
