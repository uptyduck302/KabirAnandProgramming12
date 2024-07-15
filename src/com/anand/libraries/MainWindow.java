package com.anand.libraries;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.stage.FileChooser;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;

public class MainWindow implements Initializable {
    public ImageView mainImage;
    private Stage stage;
    private File file;
    private Image image;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Platform.runLater(() -> stage = (Stage) mainImage.getScene().getWindow());
    }

    public void openFile(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setInitialDirectory(new File(System.getProperty("user.dir")));
        file = fileChooser.showOpenDialog(stage);
        try (FileInputStream stream = new FileInputStream(file)) {
            image = new Image(stream);
            mainImage.setImage(image);
            mainImage.setFitWidth(300);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
