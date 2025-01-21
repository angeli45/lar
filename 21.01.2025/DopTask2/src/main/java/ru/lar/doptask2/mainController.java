package ru.lar.doptask2;

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
    private Label lable;

    @FXML
    void BTNonAction(ActionEvent event) {
        int G = Integer.parseInt(TextField.getText());
        lable.setText(String.valueOf((G+99)/100));
    }

}
