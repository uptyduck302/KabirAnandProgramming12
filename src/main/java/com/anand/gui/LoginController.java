package com.anand.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginController {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin(ActionEvent event) throws Exception {
        String username = usernameField.getText();
        String password = passwordField.getText();

        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";

        try (Connection conn = Database.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/welcome.fxml"));
                Parent root = loader.load();

                WelcomeController controller = loader.getController();
                controller.setWelcomeMessage("Welcome " + username);

                Stage stage = (Stage) usernameField.getScene().getWindow();
                stage.setScene(new Scene(root));
            } else {
                System.out.println("Login failed");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
