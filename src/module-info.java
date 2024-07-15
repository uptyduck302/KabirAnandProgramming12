module ModuleFourLibraries {
    requires javafx.controls;
    requires javafx.fxml;
    requires metadata.extractor;

    opens com.anand.libraries to javafx.fxml;
    exports com.anand.libraries;
}
