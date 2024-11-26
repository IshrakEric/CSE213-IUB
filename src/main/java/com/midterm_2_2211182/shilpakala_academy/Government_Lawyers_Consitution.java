package com.midterm_2_2211182.shilpakala_academy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

public class PDFViewerApp extends Application {
    @Override
    public void start(Stage stage) {
        WebView webView = new WebView();
        webView.getEngine().load("file:///path/to/pdf_viewer.html"); // Adjust the path

        Scene scene = new Scene(webView, 800, 600);
        stage.setScene(scene);
        stage.setTitle("PDF Viewer");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}


public class Government_Lawyers_Consitution {

    @FXML
    void academy_art_button(ActionEvent event) {

    }

    @FXML
    void constitution_button(ActionEvent event) {

    }

    @FXML
    void file_report_button(ActionEvent event) {

    }

    @FXML
    void regulations_button(ActionEvent event) {

    }

}
