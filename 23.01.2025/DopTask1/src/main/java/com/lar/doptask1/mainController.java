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
    private TextField NTextField;

    @FXML
    private Label RezultLable;

    @FXML
    void BTNonAction(ActionEvent event) {
        int N = Integer.parseInt(NTextField.getText());
        String res = "";
        int d = N / 10;
        int e = N % 10;
        if (d == 1){
            switch (e){
                case 1:
                    res += "одиннадцать";
                    break;
                case 2:
                    res += "двенадцать";
                    break;
                case 3:
                    res += "тринадцать";
                    break;
                case 4:
                    res += "четырнадцать";
                    break;
                case 5:
                    res += "пятнадцать";
                    break;
                case 6:
                    res += "шестнадцать";
                    break;
                case 7:
                    res += "семьнадцать";
                    break;
                case 8:
                    res += "восемьнадцать";
                    break;
                case 9:
                    res += "девятнадцать";
                    break;
            }
        }
        else {
            switch (d){
                case 2:
                    res += "двадцать";
                    break;
                case 3:
                    res += "тридцать";
                    break;
                case 4:
                    res += "сорок";
                    break;
            }
            switch (e){
                case 1:
                    res += " одно";
                    break;
                case 2:
                    res += " два";
                    break;
                case 3:
                    res += " три";
                    break;
                case 4:
                    res += " четыре";
                    break;
                case 5:
                    res += " пять";
                    break;
                case 6:
                    res += " шесть";
                    break;
                case 7:
                    res += " семь";
                    break;
                case 8:
                    res += " восемь";
                    break;
                case 9:
                    res += " девять";
                    break;
            }
        }

        if (N % 10 == 1 && N != 11){
            res += " учебное задание";
        } else {
            res += " учебных заданий";
        }
        RezultLable.setText(res);
    }

}
