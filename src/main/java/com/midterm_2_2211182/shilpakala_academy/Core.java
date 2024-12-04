package com.midterm_2_2211182.shilpakala_academy;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Core {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void government_lawyers_button(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Government_Lawyers.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void internal_order_providers_button(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Government_Lawyers.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void back_button_core(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login_Data.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}

