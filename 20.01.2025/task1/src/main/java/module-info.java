module ru.zelmex.com.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.zelmex.com.task1 to javafx.fxml;
    exports ru.zelmex.com.task1;
}