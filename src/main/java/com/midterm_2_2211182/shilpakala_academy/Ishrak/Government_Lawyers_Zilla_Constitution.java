package com.midterm_2_2211182.shilpakala_academy.Ishrak;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Government_Lawyers_Zilla_Constitution implements Initializable {

    FileChooser filechooser = new FileChooser();

    private Stage stage;
    private Scene scene;
    private Parent root;

    @javafx.fxml.FXML
    private TextArea Information_Area;

    @javafx.fxml.FXML
    void Activator_Button(MouseEvent event) {
        File file = filechooser.showOpenDialog(new Stage());

        try {
            Scanner scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                Information_Area.appendText(scanner.nextLine() + "\n");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @javafx.fxml.FXML
    public void back_button_glzc(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Government_Lawyers_Choose.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        filechooser.setInitialDirectory(new File("C:\\Users\\ISHRAK\\Desktop\\IUB (All Information)\\7th Semester\\CSE213\\Shilpakala_Academy\\src\\main\\java\\com\\midterm_2_2211182\\shilpakala_academy"));
    }

}
