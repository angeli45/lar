package com.lar.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private Label sum;

    @FXML
    private TextField vvod;

    @FXML
    void BTNonAction(ActionEvent event) {
        int n = Integer.parseInt(vvod.getText());
        int s = (n/10)+(n%10);
        if (s%2==0){
            sum.setText("чётной.");
        } else {
            sum.setText("нечётной");
        }
    }

}
