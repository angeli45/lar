module com.lar.task6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.task6 to javafx.fxml;
    exports com.lar.task6;
}