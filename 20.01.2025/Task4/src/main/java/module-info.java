module ru.zelmex.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.zelmex.task4 to javafx.fxml;
    exports ru.zelmex.task4;
}