package ru.lar.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private Label result;

    @FXML
    private TextField textField;

    @FXML
    void BTNonAction(ActionEvent event) {
        int K = Integer.parseInt(textField.getText());
        int D=K%7;
        switch (D){
            case 0:
                result.setText("Воскресенье - " +0);
                break;
            case 1:
                result.setText("Понедельник - "+1);
                break;
            case 2:
                result.setText("Вторник - "+2);
                break;
            case 3:
                result.setText("Среда - "+3);
                break;
            case 4:
                result.setText("Четверг - "+4);
                break;
            case 5:
                result.setText("Пятница - "+5);
                break;
            case 6:
                result.setText("Суббота - "+6);
                break;
        }
    }

}
