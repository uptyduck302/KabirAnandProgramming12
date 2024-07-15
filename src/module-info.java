module ModuleFourLibraries {
    requires javafx.controls;
    requires javafx.fxml;
    requires metadata.extractor;
    requires jdk.graal.compiler.management;

    opens com.anand.libraries to javafx.fxml;
}
