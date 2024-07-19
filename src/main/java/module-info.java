module ModuleFiveOneMultipleWindows {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.anand.gui to javafx.fxml;
    exports com.anand.gui;
}
