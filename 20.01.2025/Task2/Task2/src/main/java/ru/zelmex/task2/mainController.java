package ru.zelmex.task2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Label PLable;

    @FXML
    private Label SLable;

    @FXML
    private TextField X1TextField;

    @FXML
    private TextField X2TextField;

    @FXML
    private TextField Y1TextField;

    @FXML
    private TextField Y2TextField;

    @FXML
    private Button btn1;

    @FXML
    void SetBTNonAction(ActionEvent event) {
        double x1 = Double.parseDouble(X1TextField.getText());
        double y1 = Double.parseDouble(Y1TextField.getText());
        double x2 = Double.parseDouble(X2TextField.getText());
        double y2 = Double.parseDouble(Y2TextField.getText());
        double a = Math.abs(x2 - x1);
        double b = Math.abs(y2 - y1);
        SLable.setText("S=" + a * b);
        PLable.setText("P=" + 2 * (a + b));
    }

}
