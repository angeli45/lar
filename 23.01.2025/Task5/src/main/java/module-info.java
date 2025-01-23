module com.lar.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lar.task5 to javafx.fxml;
    exports com.lar.task5;
}