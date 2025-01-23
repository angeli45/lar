module com.lar.doptask3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.doptask3 to javafx.fxml;
    exports com.lar.doptask3;
}