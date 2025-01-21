module ru.lar.task1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.lar.task1 to javafx.fxml;
    exports ru.lar.task1;
}