module ru.lar.task2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.lar.task2 to javafx.fxml;
    exports ru.lar.task2;
}