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
    private TextField NTextField;

    @FXML
    private Label RezultLable;

    @FXML
    void BTNonAction(ActionEvent event) {
        int N = Integer.parseInt(NTextField.getText());
        String res = "";
        int s = N / 100;
        int d = N / 10 % 10;
        int e = N % 10;
        switch (s){
            case 1:
                res += "сто";
                break;
            case 2:
                res += "двести";
                break;
            case 3:
                res += "триста";
                break;
            case 4:
                res += "четыреста";
                break;
            case 5:
                res += "пятьсот";
                break;
            case 6:
                res += "шестьсот";
                break;
            case 7:
                res += "семьсот";
                break;
            case 8:
                res+= "восемьсот";
                break;
            case 9:
                res += "девятьсот";
                break;
        }
        if (d == 1){
            switch (e){
                case 1:
                    res += " одиннадцать";
                    break;
                case 2:
                    res += " двенадцать";
                    break;
                case 3:
                    res += " тринадцать";
                    break;
                case 4:
                    res += " четырнадцать";
                    break;
                case 5:
                    res += " пятнадцать";
                    break;
                case 6:
                    res += " шестнадцать";
                    break;
                case 7:
                    res += " семьнадцать";
                    break;
                case 8:
                    res += " восемьнадцать";
                    break;
                case 9:
                    res += " девятнадцать";
                    break;
            }
        }
        else {
            switch (d){
                case 2:
                    res += " двадцать";
                    break;
                case 3:
                    res += " тридцать";
                    break;
                case 4:
                    res += " сорок";
                    break;
                case 5:
                    res += " пятьдесят";
                    break;
                case 6:
                    res += " шестьдесят";
                    break;
                case 7:
                    res += " семьдесят";
                    break;
                case 8:
                    res += " восемьдесят";
                    break;
                case 9:
                    res += " девяносто";
                    break;
            }
            switch (e){
                case 1:
                    res += " один";
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
        RezultLable.setText(res);
    }

}
