package com.midterm_2_2211182.shilpakala_academy.Mumtahina;

import com.midterm_2_2211182.shilpakala_academy.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneSwitcher {
    public static void switchScene(ActionEvent event, String fxmlFile) throws IOException {
        Parent parent = FXMLLoader.load(Main.class.getResource(fxmlFile));
        Scene scene = new Scene(parent);
        Stage stage = (Stage)(((Node) event.getSource()).getScene().getWindow());
        stage.setScene(scene);

    }
}
