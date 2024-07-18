package com.anand;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class MainWindow {

    @FXML
    public void openNewWindow(ActionEvent event) {
        Alert alert = new Alert(AlertType.ERROR);
        alert.setContentText("This is an alert");
        alert.setHeaderText("Header Text");
        alert.showAndWait();
    }

    @FXML
    public void loadNewWindow(ActionEvent event) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("/fxml/newWindow.fxml"));
            Stage stage = new Stage(StageStyle.DECORATED);
            stage.setTitle("New Window Title");
            stage.setScene(new Scene(parent));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
