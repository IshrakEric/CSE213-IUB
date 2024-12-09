package Ishrak;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;

public class Sign_Up {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label dob_label;
    @FXML
    private Label email_label;
    @FXML
    private Label password_label;
    @FXML
    private Label sign_up_label;
    @FXML
    private Label username_label;
    @FXML
    private Label signup_label;
    @FXML
    private PasswordField password_field_signup;
    @FXML
    private TextField username_field_signup;
    @FXML
    private DatePicker dob_field_signup;
    @FXML
    private TextField email_field_signup;

    @javafx.fxml.FXML
    public void signUp_button(ActionEvent event) throws IOException {
        checkSignup();

        Parent root = FXMLLoader.load(getClass().getResource("Login_and_SignUp.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void back_button_signup(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Login_and_SignUp.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    private void checkSignup() throws IOException {
        //Main m = new Main();
        if(email_field_signup.getText().toString().equals("dummy") && password_field_signup.getText().toString().equals("123") && username_field_signup.getText().toString().equals("dummy") && dob_field_signup.getValue().isBefore(LocalDate.now())) {
            signup_label.setText("Sign-Up Successful!");

            //m.changeScene();
        }

        else if(email_field_signup.getText().isEmpty() && password_field_signup.getText().isEmpty()) {
            signup_label.setText("Please enter your data.");
        }


        else {
            signup_label.setText("Wrong username or password!");
        }
    }

    @Deprecated
    public void password_field(ActionEvent actionEvent) {
    }

    @Deprecated
    public void email_field(ActionEvent actionEvent) {
    }

    @Deprecated
    public void username_field(ActionEvent actionEvent) {
    }

    @Deprecated
    public void dob_field(ActionEvent actionEvent) {
    }
}

