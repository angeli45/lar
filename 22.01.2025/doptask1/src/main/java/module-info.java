module com.lar.doptask1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.doptask1 to javafx.fxml;
    exports com.lar.doptask1;
}