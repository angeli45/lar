package ru.zelmex.task3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class mainController {

    @FXML
    private Button BTN1;

    @FXML
    private TextField IrisKG;

    @FXML
    private TextField IrisRUB;

    @FXML
    private Label Razd;

    @FXML
    private Label S1KGIris;

    @FXML
    private Label S1KGShoc;

    @FXML
    private TextField ShocRUB;

    @FXML
    private TextField shocKG;

    @FXML
    void SetBTN1onAction(ActionEvent event) {
        double x = Double.parseDouble(shocKG.getText());
        double y = Double.parseDouble(IrisKG.getText());
        double a = Double.parseDouble(ShocRUB.getText());
        double b = Double.parseDouble(IrisRUB.getText());
        double s=a/x;
        double i=b/y;
        S1KGShoc.setText(" "+s);
        S1KGIris.setText(" "+i);
        Razd.setText(" "+(s/i));

    }

}
