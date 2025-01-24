package com.lar.doptask2;

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
    private TextField ETextField;

    @FXML
    private Label aLable;

    @FXML
    private Label bLable;

    @FXML
    private Label dLable;

    @FXML
    private Label eLable;

    @FXML
    private Label gLable;

    @FXML
    private Label vLable;

    @FXML
    void BTNonAction(ActionEvent event) {
        int E = Integer.parseInt(ETextField.getText());
        double a=0, b=0, v=0, d=0, g=0, e=0;
        for (int i = 1; i <= E; i++) {
            a = a + 1.0 / pow(i, 8);
            b=b+1.0/(i*(i+1));
            d=d+pow(-1,i+1)/(i*(i+1)*(i+2));
        }
        for (int i=0;i<=E; i++){
            int t=1;
            for (int j=1; j<=i; j++){
                t=t*j;
            }
            v=v+pow(-1,i)/t;
            g=g+pow(-2,i)/t;
            e = e + (1 / (pow(4, i) + pow(5, i)));
        }
        aLable.setText("а) "+a);
        bLable.setText("б) "+b);
        vLable.setText("в) "+v);
        gLable.setText("г) "+g);
        dLable.setText("д) "+d);
        eLable.setText("е) "+e);
    }

}
