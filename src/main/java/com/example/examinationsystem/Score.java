package com.example.examinationsystem;

import com.example.examinationsystem.model.CourseRequest;
import com.example.examinationsystem.store.Database;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Score implements Initializable {
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
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    void addSubject(ActionEvent event) {

        subject();
        System.out.println("***".repeat(20));
        System.out.println(Database.listCourse().size());
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
        clearText();

    }
    private void clearText(){
        courseName.clear();
        courseCode.clear();
        qnsPerExam.clear();

    }

}
