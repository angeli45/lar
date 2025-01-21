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
    private TextField TextField;

    @FXML
    private Label result;

    @FXML
    void BTNonAction(ActionEvent event) {
        int N = Integer.parseInt(TextField.getText());
        result.setText(String.valueOf(N%60));
    }

}
