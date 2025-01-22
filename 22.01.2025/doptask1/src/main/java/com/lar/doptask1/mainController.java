package com.lar.doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private Label OpisLable;

    @FXML
    private TextField setN;

    @FXML
    void BNTonAction(ActionEvent event) {
        int n = Integer.parseInt(setN.getText());
        String S = "";
        if (n == 0) {
            OpisLable.setText("Нулевое число");
            return;
        }
        else if (n > 0) {
            S = "Положительное ";
        } else
            S="Отрицательное";
        if (n%2==0)
            S=S+"чётное число";
        else S=S+"нечётное число";
        OpisLable.setText(S);
    }

}
