package com.example.examinationsystem;

import com.example.examinationsystem.model.CourseRequest;
import com.example.examinationsystem.model.ExamRequest;
import com.example.examinationsystem.model.StudentRequest;
import com.example.examinationsystem.store.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Subject implements Initializable {

    @FXML
    private DialogPane addStudentDialog;

    private ObservableList<Subject> tvObservableList = FXCollections.observableArrayList();
    @FXML
    private TableView<CourseRequest> courseTable;
    @FXML
    private TableColumn<CourseRequest, Void> action;

    @FXML
    private TableColumn<CourseRequest, String> courseCode;

    @FXML
    private TableColumn<CourseRequest, String> courseName;

    @FXML
    private TableColumn<CourseRequest, String> qnsPerExam;

    @FXML
    private TableColumn<CourseRequest, Integer> subjectId;
    @FXML
    private Button addSubject;
    private Database data ;
    private  Integer number;
    private ObservableList<StudentRequest> appMainObservableList;
    ObservableList<CourseRequest> courseRequestsObeservableList;
    private List<CourseRequest> courseList;

    @FXML
    void addSubject(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addSubjectDialogTwo.fxml"));
        Parent parent = fxmlLoader.load();
        Score dialogController = fxmlLoader.<Score>getController();
//        dialogController.setAppMainObservableList(tvObservableList);

        Scene scene = new Scene(parent, 640, 450);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        courseCode = new TableColumn<CourseRequest, String>();
        courseName = new TableColumn<CourseRequest, String>();
        qnsPerExam= new TableColumn<CourseRequest, String>();

        courseRequestsObeservableList=FXCollections.observableArrayList();
        data = new Database();
        courseList = new ArrayList<>();
        setColumnProperty();
        courseRequestsObeservableList.addAll(Database.listCourse());
        courseTable.setItems(courseRequestsObeservableList);





    }

    public void setColumnProperty() {




        courseCode.setCellValueFactory(new PropertyValueFactory<CourseRequest,String>("courseCode"));
        courseName.setCellValueFactory(new PropertyValueFactory<CourseRequest,String>("courseName"));
        qnsPerExam.setCellValueFactory(new PropertyValueFactory<CourseRequest,String>("qnsPerExam"));
        courseTable.setItems(courseRequestsObeservableList);
//        studentTable.getColumns().addAll(courseColumn,emailColumn,fullnameColumn,idColumn);
    }
    public void setAppMainObservableList(ObservableList<StudentRequest> tvObservableList) {
        this.appMainObservableList = tvObservableList;

    }


}




