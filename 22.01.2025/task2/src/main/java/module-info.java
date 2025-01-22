module com.lar.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.task2 to javafx.fxml;
    exports com.lar.task2;
}