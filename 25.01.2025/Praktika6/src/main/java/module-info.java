module ru.lar.praktika6 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens ru.lar.praktika6 to javafx.fxml;
    exports ru.lar.praktika6;
}