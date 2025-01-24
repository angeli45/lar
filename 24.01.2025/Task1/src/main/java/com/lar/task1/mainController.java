package com.lar.task1;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.List;

public class mainController {

    @FXML
    private Label RezultLabel;

    @FXML
    private ListView<Integer> SetListView;

    @FXML
    private Button cBTN;

    @FXML
    private Button dBTN;

    @FXML
    private TextField nTextField;

    @FXML
    private Button okBTN;

    @FXML
    void OKonAction(ActionEvent event) {
        List<Integer> data = SetListView.getItems();
        int min = 30000;
        for (int i = 0; i < data.size(); i++) {
            int m = data.get(i);
            if (m % 3 == 0 && m < min) {
                min = m;
            }
        }
        if (min != 0)
            RezultLabel.setText(String.valueOf(min));
        else RezultLabel.setText("Чисел оканчивающихся на 3 нет");
    }

    @FXML
    void cancelonAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void donAction(ActionEvent event) {
        if (nTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(nTextField.getText());
            SetListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Введены некорректные данные");
            alert.showAndWait();
        } finally {
            nTextField.setText("");
        }
    }

}
