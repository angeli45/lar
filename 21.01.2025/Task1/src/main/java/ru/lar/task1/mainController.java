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
    private TextField TextField;

    @FXML
    private Label des;

    @FXML
    private Label ed;

    @FXML
    void SetBTNonAction(ActionEvent event) {
        int d = Integer.parseInt(TextField.getText());
        des.setText(String.valueOf(d/10));
        ed.setText(String.valueOf(d%10));
    }

}
