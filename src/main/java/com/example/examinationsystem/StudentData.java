package com.example.examinationsystem;

import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ResourceBundle;

public class StudentData implements Initializable {
    @FXML
    private ComboBox<String> comboBox;
    @FXML
    private TextField textInput;

    @FXML
    private DialogPane addStudentDialog;



    @FXML
    void getValue(ActionEvent event) {
    comboBox.getItems().add(textInput.getText());
    textInput.clear();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    comboBox.setItems(FXCollections.observableArrayList("Java","Html","Css","Javascript","Python","Php"));


    }




    @FXML
    void addStudent(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader=new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("addStudentDialog.fxml"));
            addStudentDialog =fxmlLoader.load();
            StudentData studentData =fxmlLoader.getController();

        }catch (IOException e){

        }
    }


}
