package com.midterm_2_2211182.shilpakala_academy;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Government_Lawyers_Constitution {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void constitution_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void regulations_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void academy_art_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void file_report_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_3.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void back_button_glc(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}