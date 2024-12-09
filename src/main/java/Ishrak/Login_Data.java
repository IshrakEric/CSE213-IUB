package Ishrak;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class Login_Data {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label login_info_label;
    @FXML
    private Label email_label;
    @FXML
    private Label password_label;
    @FXML
    private TextField email_field_login_info;
    @FXML
    private PasswordField password_field_login_info;
    @FXML
    private Label login_label;

    @javafx.fxml.FXML
    public void back_button_login_info(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("Login_and_SignUp.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    @javafx.fxml.FXML
    public void login_button(ActionEvent event) throws IOException {
        checkLogin();

        Parent root = FXMLLoader.load(getClass().getResource("Core.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void email_field_login_info(ActionEvent actionEvent) {

    }

    public void password_field_login_info(ActionEvent actionEvent) {

    }

    private void checkLogin() throws IOException {
        //Main m = new Main();
        if(email_field_login_info.getText().toString().equals("javacoding") && password_field_login_info.getText().toString().equals("123")) {
            login_label.setText("Success!");

            //m.changeScene();
        }

        else if(email_field_login_info.getText().isEmpty() && password_field_login_info.getText().isEmpty()) {
            login_label.setText("Please enter your data.");
        }


        else {
            login_label.setText("Wrong username or password!");
        }
    }

}