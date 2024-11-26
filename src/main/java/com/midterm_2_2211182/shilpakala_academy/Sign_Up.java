package com.midterm_2_2211182.shilpakala_academy;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Sign_Up {

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
    void dob_field(ActionEvent event) {

    }

    @FXML
    void email_field(ActionEvent event) {

    }

    @FXML
    void password_field(ActionEvent event) {

    }

    @FXML
    void username_field(ActionEvent event) {

    }

    public Sign_Up(Label dob_label, Label email_label, Label password_label, Label sign_up_label, Label username_label) {
        this.dob_label = dob_label;
        this.email_label = email_label;
        this.password_label = password_label;
        this.sign_up_label = sign_up_label;
        this.username_label = username_label;
    }

    public Label getDob_label() {
        return dob_label;
    }

    public void setDob_label(Label dob_label) {
        this.dob_label = dob_label;
    }

    public Label getEmail_label() {
        return email_label;
    }

    public void setEmail_label(Label email_label) {
        this.email_label = email_label;
    }

    public Label getPassword_label() {
        return password_label;
    }

    public void setPassword_label(Label password_label) {
        this.password_label = password_label;
    }

    public Label getSign_up_label() {
        return sign_up_label;
    }

    public void setSign_up_label(Label sign_up_label) {
        this.sign_up_label = sign_up_label;
    }

    public Label getUsername_label() {
        return username_label;
    }

    public void setUsername_label(Label username_label) {
        this.username_label = username_label;
    }

    @Override
    public String toString() {
        return "Sign_Up{" +
                "dob_label=" + dob_label +
                ", email_label=" + email_label +
                ", password_label=" + password_label +
                ", sign_up_label=" + sign_up_label +
                ", username_label=" + username_label +
                '}';
    }
}

