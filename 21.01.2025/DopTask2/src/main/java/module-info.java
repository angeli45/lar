module ru.lar.doptask2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.lar.doptask2 to javafx.fxml;
    exports ru.lar.doptask2;
}