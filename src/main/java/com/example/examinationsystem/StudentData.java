package com.example.examinationsystem;

import com.example.examinationsystem.model.CourseRequest;
import com.example.examinationsystem.model.ExamRequest;
import com.example.examinationsystem.store.Database;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
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
    private Button addSubject;

    @FXML
    private TextField courseCode;

    @FXML
    private TextField courseName;

    @FXML
    private TextField qnsPerExam;

    @FXML
    private TextField subjectId;
  private Database data;



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

    @FXML
    void addSubject(ActionEvent event) {

        subject();
    }
    private void subject(){
        String cseCode=courseCode.getText();
        String cseName= courseName.getText();
        String perExam = qnsPerExam.getText();

        CourseRequest payload = new CourseRequest();
        payload.setCourseCode(cseCode);
        payload.setCourseName(cseName);
        payload.setQnsPerExam(perExam);
        Database.addCourse(payload);


    }
    private void clearText(){
        courseName.clear();
        courseCode.clear();
        qnsPerExam.clear();

    }


}
