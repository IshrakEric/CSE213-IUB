package com.midterm_2_2211182.shilpakala_academy.Ishrak;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Government_Lawyers_Choose {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void upzilla_constitution_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_Upzilla_Constitution.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void zilla_constitution_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_Zilla_Constitution.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void regulations_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_Regulations.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void academy_art_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_Academy_Art.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void file_report_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_File_Report.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void back_button_glc(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("com.midterm_2_2211182.shilpakala_academy.Ishrak.Government_Lawyers.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}