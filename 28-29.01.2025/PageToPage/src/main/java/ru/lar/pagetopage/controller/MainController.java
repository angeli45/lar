package ru.lar.pagetopage.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

import static ru.lar.pagetopage.util.Manager.showSecondScene;

public class MainController implements Initializable {

    @FXML
    private Button BTN1;

    @FXML
    void goBTNOnAction(ActionEvent event) {
        showSecondScene("scrine2.fxml", "Marathon Skills 2016 - Register as a runenr");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
BTN1.setStyle("-fx-background-color:#20B2AA; -fx-background-radius:5 px; -fx-text-fill:affffff");
    }
}
