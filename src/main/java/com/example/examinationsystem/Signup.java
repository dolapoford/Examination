package com.example.examinationsystem;

import com.example.examinationsystem.model.SignupRequest;
import com.example.examinationsystem.model.StudentRequest;
import com.example.examinationsystem.store.Database;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;
import java.util.ResourceBundle;

public class Signup implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private ComboBox<String> comboBox;

    @FXML
    private PasswordField confirmPassword;

    @FXML
    private TextField email;

    @FXML
    private TextField fullName;


    @FXML
    private PasswordField password;

    @FXML
    private TextField username;


    @FXML
    void back_to_login(MouseEvent event) throws IOException {
//    HelloApplication.stage.getScene().setRoot(MetaData.parent);
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("login.fxml"));
        HelloApplication.stage.getScene().setRoot(fxmlLoader);
    }

    @FXML
    void close_app(MouseEvent event) {
            System.exit(0);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboBox.setItems(FXCollections.observableArrayList("Java","Html","Css","Javascript","Python","Php"));
    }
    private static void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }
private void validateForm(){
      String uName = username.getText();
      String pword = password.getText();
      String confirmp = confirmPassword.getText();
      String em = email.getText();
      String fName =fullName.getText();


      if(uName==null || uName.isBlank()){
          showAlert(Alert.AlertType.ERROR, "Form Error!",
                  "Please enter your Username id");
      }
      else if (pword==null || pword.isBlank()){
          showAlert(Alert.AlertType.ERROR, "Form Error!",
                  "Please enter your Password");
      }
      else if (confirmp==null || confirmp.isBlank()){
          showAlert(Alert.AlertType.ERROR, "Form Error!",
                  "Please enter your Confirm Password");
      }
      else if (!pword.equals(confirmp)){
          showAlert(Alert.AlertType.ERROR, "Form Error!",
                  "Please enter the correct  Password");
      }
     else if (em==null || em.isBlank()){
          showAlert(Alert.AlertType.ERROR, "Form Error!",
                  "Please enter your Confirm Email");
      }else if (fName==null || fName.isBlank()){
          showAlert(Alert.AlertType.ERROR, "Form Error!",
                  "Please enter your Full Name");
      }
     else{
          StudentRequest payload =new StudentRequest();
          payload.setEmail(em);
          payload.setPassword(pword);
          payload.setFullName(fName);
          payload.setUsername(uName);
          ArrayList<String> courseList = new ArrayList<>();
          courseList.add(comboBox.getSelectionModel().getSelectedItem());
          payload.setCourse(courseList);
          Database.saveStudent(payload);
          clearText();
          showAlert(Alert.AlertType.INFORMATION, "Success",
                  "Student Created successfully");
      }



}
private void clearText(){
        username.clear();
        fullName.clear();
        password.clear();
        confirmPassword.clear();
        email.clear();
        comboBox.getSelectionModel().select(0);
}

    @FXML
    void signUp(ActionEvent event) {
validateForm();
        System.out.println("***".repeat(20));
        System.out.println(Database.listStudent().size());



    }
}
