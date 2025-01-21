package ru.zelmex.task4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import static java.lang.Math.*;
import static java.lang.Math.log;

public class mainController {

    @FXML
    private Button BTN1;

    @FXML
    private Label Rezult;

    @FXML
    private TextField SetB;

    @FXML
    private TextField SetX;

    @FXML
    void SetBTN1onAction(ActionEvent event) {
        double x = Double.parseDouble(SetX.getText());
        double b = Double.parseDouble(SetB.getText());
        double z = pow(x, 2) + pow(b, 2);
        double a = (pow(x, 6) + sqrt(z * pow(x, 4) + cos(x + z))) / (log(x + z));
        Rezult.setText(" "+a);
    }

}
