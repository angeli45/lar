package ru.lar.task3;

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
    private Label DLable;

    @FXML
    private Label LLable;

    @FXML
    private Label RLable;

    @FXML
    private Label SLable;

    @FXML
    private TextField eTextField;

    @FXML
    private TextField zTextField1;

    @FXML
    void BTNonAction(ActionEvent event) {
        int e = Integer.parseInt(eTextField.getText());
        int z = Integer.parseInt(zTextField1.getText());
        switch (e) {
            case 1:
                RLable.setText(String.valueOf(z));
                DLable.setText(String.valueOf(2 * z));
                LLable.setText(String.valueOf(2 * PI * z));
                SLable.setText(String.valueOf(PI * pow(z, 2)));
                break;
            case 2:
                RLable.setText(String.valueOf(z / 2));
                DLable.setText(String.valueOf(z));
                LLable.setText(String.valueOf(PI * z));
                SLable.setText(String.valueOf((PI * pow(z, 2)) / 4));
                break;
            case 3:
                RLable.setText(String.valueOf(z / (2 * PI)));
                DLable.setText(String.valueOf(z / PI));
                LLable.setText(String.valueOf(z));
                SLable.setText(String.valueOf(pow(z, 2) / (4 * PI)));
                break;
            case 4:
                RLable.setText(String.valueOf(sqrt(z / PI)));
                DLable.setText(String.valueOf(2 * sqrt(z / PI)));
                LLable.setText(String.valueOf(PI * 4 * z));
                SLable.setText(String.valueOf(z));
        }

    }

}
