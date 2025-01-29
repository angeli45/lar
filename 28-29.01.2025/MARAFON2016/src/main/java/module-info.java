module com.lar.marafon2016 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.marafon2016 to javafx.fxml;
    exports com.lar.marafon2016;
    exports com.lar.marafon2016.controller;
    opens com.lar.marafon2016.controller to javafx.fxml;
}