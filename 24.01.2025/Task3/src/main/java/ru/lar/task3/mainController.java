package ru.lar.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField ATextField;

    @FXML
    private Button BTN;

    @FXML
    private TextField BTextField;

    @FXML
    private Label Rezult;

    @FXML
    void BTNonAction(ActionEvent event) {
        int a = Integer.parseInt(ATextField.getText());
        int b = Integer.parseInt(BTextField.getText());
        int r = 0;
        for (int i = a; i <=b; i++) {
            if (i<=b) {
                r= r+i;
            }
        }
        if (r !=0){
            Rezult.setText(String.valueOf(r));
        }else Rezult.setText("Что-то не так");
    }

}
