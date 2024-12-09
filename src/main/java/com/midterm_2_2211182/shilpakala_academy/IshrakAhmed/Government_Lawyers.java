package com.midterm_2_2211182.shilpakala_academy.IshrakAhmed;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Government_Lawyers {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    public void act_and_rules_tab_button(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_Choose.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void back_button_government_lawyers(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login_Data.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

}
