module com.anand.gui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.anand.gui to javafx.fxml;
    exports com.anand.gui;
}
