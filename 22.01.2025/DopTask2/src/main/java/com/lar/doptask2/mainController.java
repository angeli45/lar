package com.lar.doptask2;

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
        if (0 > n || n < 1000) {
            if (n % 2 == 0)
                S = "Чётное ";
            else S = "Нечётное ";
            if (n > 99) {
                S = S + "трёхзначное число";
            } else if (n > 9) S = S + "двузначное число";
            else S = S + "однозначное число";
            OpisLable.setText(S);
        } else OpisLable.setText("Неправильные данные");
    }

}
