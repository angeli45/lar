module com.lar.marafon {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.marafon to javafx.fxml;
    exports com.lar.marafon;
    exports com.lar.marafon.controller;
    opens com.lar.marafon.controller to javafx.fxml;
    exports com.lar.marafon.util;
    opens com.lar.marafon.util to javafx.fxml;
}