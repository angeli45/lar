package ru.lar.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private Label rezLable;

    @FXML
    private TextField vTextField;

    @FXML
    void BTNonAction(ActionEvent event) {
        int v = Integer.parseInt(vTextField.getText());
        int vd = v / 10;
        int ve = v % 10;
        String rez = " ";
        switch (vd) {
            case 2:
                rez = "Двадцать ";
                break;
            case 3:
                rez = "Тридцать ";
                break;
            case 4:
                rez = "Сорок ";
                break;
            case 5:
                rez = "Пятьдесят ";
                break;
            case 6:
                rez = "Шестьдесят ";
                break;
        }
        if (ve == 0) {
            rez = rez + "лет";
        }else
            switch (ve){
                case 1:
                    rez=rez+"один год";
                    break;
                case 2:
                    rez=rez+"два года";
                    break;
                case 3:
                    rez=rez+"три года";
                    break;
                case 4:
                    rez=rez+"четыре года";
                    break;
                case 5:
                    rez=rez+"пять лет";
                    break;
                case 6:
                    rez=rez+"шесть лет";
                    break;
                case 7:
                    rez=rez+"семь лет";
                    break;
                case 8:
                    rez=rez+"восемь лет";
                    break;
                case 9:
                    rez=rez+"девять лет";
                    break;
            }
        rezLable.setText(rez);
    }

}
