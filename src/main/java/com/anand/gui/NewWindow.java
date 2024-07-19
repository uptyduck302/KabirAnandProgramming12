package com.anand.gui;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class NewWindow {
    @FXML
    private Label label;

    @FXML
    private void initialize() {
        label.setText("Have a good day!");
    }
}
