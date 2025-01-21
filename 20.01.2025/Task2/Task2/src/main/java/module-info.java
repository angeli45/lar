module ru.zelmex.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.zelmex.task2 to javafx.fxml;
    exports ru.zelmex.task2;
}