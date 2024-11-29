module puzzle {
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.graphics;
    opens com.exemple.packman to javafx.fxml;
    exports com.exemple.packman;
}