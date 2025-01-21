module ru.zelmex.task3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.zelmex.task3 to javafx.fxml;
    exports ru.zelmex.task3;
}