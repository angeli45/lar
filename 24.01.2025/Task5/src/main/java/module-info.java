module ru.lar.task5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.lar.task5 to javafx.fxml;
    exports ru.lar.task5;
}