module ru.lar.pagetopage {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.lar.pagetopage to javafx.fxml;
    exports ru.lar.pagetopage;
    exports ru.lar.pagetopage.controller;
    opens ru.lar.pagetopage.controller to javafx.fxml;
}