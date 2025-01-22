module com.lar.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.task1 to javafx.fxml;
    exports com.lar.task1;
}