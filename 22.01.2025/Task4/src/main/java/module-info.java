module com.lar.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.task4 to javafx.fxml;
    exports com.lar.task4;
}