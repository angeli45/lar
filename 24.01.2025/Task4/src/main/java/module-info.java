module ru.lar.task4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.lar.task4 to javafx.fxml;
    exports ru.lar.task4;
}