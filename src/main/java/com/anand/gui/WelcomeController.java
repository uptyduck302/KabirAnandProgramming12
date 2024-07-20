package com.anand.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class WelcomeController {
    @FXML
    private Label welcomeLabel;

    public void setWelcomeMessage(String message) {
        welcomeLabel.setText(message);
    }

    @FXML
    private void showAddUserWindow(ActionEvent event) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("/addUser.fxml"));
        Stage stage = new Stage();
        stage.setTitle("Add User");
        stage.setScene(new Scene(root));
        stage.show();
    }
}
