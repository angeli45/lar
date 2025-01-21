package ru.lar.doptask1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN;

    @FXML
    private TextField aTextField;

    @FXML
    private TextField bTextField;

    @FXML
    private TextField cTextField;

    @FXML
    private Label col;

    @FXML
    private Label pl;

    @FXML
    void BTNonAction(ActionEvent event) {
        int A = Integer.parseInt(aTextField.getText());
        int B = Integer.parseInt(bTextField.getText());
        int C = Integer.parseInt(cTextField.getText());
        col.setText(String.valueOf(A*B/(C*4)));
        pl.setText(String.valueOf(A*B%(C*4)));
    }

}
