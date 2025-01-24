module ru.lar.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.lar.task3 to javafx.fxml;
    exports ru.lar.task3;
}