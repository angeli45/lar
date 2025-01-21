package ru.zelmex.com.task1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private TextField ATextField;

    @FXML
    private TextField BTextField;

    @FXML
    private TextField CTextField;

    @FXML
    private Label RezultP;

    @FXML
    private Label RezultV;

    @FXML
    private Label SetB;

    @FXML
    private Button btn1V;

    @FXML
    private Button btn2P;

    @FXML
    private Label textA;

    @FXML
    void SentBTN1onAction(ActionEvent event) {
        double a = Double.parseDouble(ATextField.getText());
        double b = Double.parseDouble(BTextField.getText());
        double c = Double.parseDouble(CTextField.getText());
        RezultV.setText("V="+(a*b*c));
    }
    @FXML
    void SentBTN2onAction(ActionEvent event) {
        double a = Double.parseDouble(ATextField.getText());
        double b = Double.parseDouble(BTextField.getText());
        double c = Double.parseDouble(CTextField.getText());
        RezultP.setText("P="+(a*b+b*c+c*a));
    }

}
