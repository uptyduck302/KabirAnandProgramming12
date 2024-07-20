package com.anand.gui;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddUserController {
    @FXML
    private TextField newUsernameField;
    @FXML
    private PasswordField newPasswordField;

    @FXML
    private void handleAddUser(ActionEvent event) {
        String username = newUsernameField.getText();
        String password = newPasswordField.getText();

        String sql = "INSERT INTO users(username, password) VALUES(?, ?)";

        try (Connection conn = Database.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, username);
            pstmt.setString(2, password);
            pstmt.executeUpdate();
            System.out.println("User added");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

