package ru.lar.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private TextField dTextField;

    @FXML
    private TextField eTextField;

    @FXML
    private Label rezLable;

    @FXML
    void BTNonAction(ActionEvent event) {
        int e = Integer.parseInt(eTextField.getText());
        int d = Integer.parseInt(dTextField.getText());
        if (e > 6 || e < 0) {
rezLable.setText("Неверное значение единицы. Введите число от 1 до 5.");
        } else {
            switch (e) {
                case 1:
                    rezLable.setText(String.valueOf(d/10));
                    break;
                case 2:
                    rezLable.setText(String.valueOf(d*100));
                    break;
                case 3:
                    rezLable.setText(String.valueOf(d));
                    break;
                case 4:
                    rezLable.setText(String.valueOf(d/1000));
                    break;
                case 5:
                    rezLable.setText(String.valueOf(d/100));
                    break;
            }
        }
    }

}
