module com.lar.doptask2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.doptask2 to javafx.fxml;
    exports com.lar.doptask2;
}