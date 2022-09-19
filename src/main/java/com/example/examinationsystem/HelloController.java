package com.example.examinationsystem;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Pane content_area;
    @FXML
    private AnchorPane main_pane;
    private String adminUsername = "admin";
    private String adminPassword = "admin";

    @FXML
    private TextField loginEmail;

    @FXML
    private PasswordField loginPassword;

    @FXML
    void open_signup(MouseEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("signup.fxml"));
       content_area.getChildren().removeAll();
       content_area.getChildren().setAll(fxml);

    }

    @FXML
    void open_student(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("studentdata.fxml"));
        main_pane.getChildren().removeAll();
        main_pane.getChildren().setAll(fxml);
    }
    @FXML
    void open_dashboard(ActionEvent event) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("student.fxml"));
        HelloApplication.stage.getScene().setRoot(fxmlLoader);
    }

    @FXML
    void close_button(MouseEvent event) {
System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }
    @FXML
    void open_data(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("Subject.fxml"));
        main_pane.getChildren().removeAll();
        main_pane.getChildren().setAll(fxml);
    }

    @FXML
    void examBtn(ActionEvent event) throws IOException {
        Parent fxml =FXMLLoader.load(getClass().getResource("upcomingExam.fxml"));
        main_pane.getChildren().removeAll();
        main_pane.getChildren().setAll(fxml);
    }

    @FXML
    void open_question(ActionEvent event) throws IOException {
        Parent fxml =FXMLLoader.load(getClass().getResource("examination.fxml"));
        main_pane.getChildren().removeAll();
        main_pane.getChildren().setAll(fxml);
    }
    private static void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }

    public static void infoBox(String infoMessage, String headerText, String title){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText(infoMessage);
        alert.setTitle(title);
        alert.setHeaderText(headerText);
        alert.showAndWait();
    }


    @FXML
    void login(ActionEvent event) {
        String username = loginEmail.getText().toString();
        String password = loginPassword.getText().toString();
        if(loginEmail.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Form Error!",
                    "Please enter your email id");
            return;
        }
        if(loginPassword.getText().isEmpty()) {
            showAlert(Alert.AlertType.ERROR, "Form Error!",
                    "Please enter a password");
            return;
        }

        if(adminUsername.equals(username) && adminPassword.equals(password)){
            infoBox("Login Successful!", null, "Success");
        } else{
            infoBox("Please enter correct Email and Password", null, "Failed");
        }
    }



}