package ru.lar.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.lar.pagetopage.util.Manager.showSecondScene;

public class SecondController implements Initializable {

    @FXML
    private Button BTN1;

    @FXML
    void goBTNOnAction(ActionEvent event) {
        showSecondScene("hello-view.fxml", "Marathon Skills 2016 - Register as a runenr");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
