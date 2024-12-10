package com.midterm_2_2211182.shilpakala_academy.Rafid;
import java.io.IOException;
import java.util.Objects;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class SceneSwitcherClass {
    public static void switchToScene(Stage stage, String resource) {
        try {
            Parent root = FXMLLoader.load(Objects.requireNonNull(SceneSwitcherClass.class.getResource(resource)));
            Scene scene = new Scene(root);
            stage.setScene(scene);
        } catch (IOException ex) {
            System.out.println("Error switching to scene: " + resource);
            ex.printStackTrace();
        }
    }
}
