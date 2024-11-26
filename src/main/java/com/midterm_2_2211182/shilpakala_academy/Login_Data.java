package com.midterm_2_2211182.shilpakala_academy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Login_Data {

    @FXML
    private TextField email_field;

    @FXML
    private Label email_label;

    @FXML
    private Label login_info_label;

    @FXML
    private TextField password_field;

    @FXML
    private Label password_label;

    @FXML
    void login_button(ActionEvent event) {

    }

    public TextField getEmail_field() {
        return email_field;
    }

    public void setEmail_field(TextField email_field) {
        this.email_field = email_field;
    }

    public Label getEmail_label() {
        return email_label;
    }

    public void setEmail_label(Label email_label) {
        this.email_label = email_label;
    }

    public Label getLogin_info_label() {
        return login_info_label;
    }

    public void setLogin_info_label(Label login_info_label) {
        this.login_info_label = login_info_label;
    }

    public TextField getPassword_field() {
        return password_field;
    }

    public void setPassword_field(TextField password_field) {
        this.password_field = password_field;
    }

    public Label getPassword_label() {
        return password_label;
    }

    public void setPassword_label(Label password_label) {
        this.password_label = password_label;
    }

    @Override
    public String toString() {
        return "Login_Data{" +
                "email_field=" + email_field +
                ", email_label=" + email_label +
                ", login_info_label=" + login_info_label +
                ", password_field=" + password_field +
                ", password_label=" + password_label +
                '}';
    }

    public Login_Data(TextField email_field, Label email_label, Label login_info_label, TextField password_field, Label password_label) {
        this.email_field = email_field;
        this.email_label = email_label;
        this.login_info_label = login_info_label;
        this.password_field = password_field;
        this.password_label = password_label;
    }



}