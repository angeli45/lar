module com.lar.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.task3 to javafx.fxml;
    exports com.lar.task3;
}