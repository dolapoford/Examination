package com.example.examinationsystem;

import com.example.examinationsystem.model.StudentRequest;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Student implements Initializable {
    @FXML
    private TableView<StudentRequest> studentTable;
    @FXML
    private TableColumn<StudentRequest, String> courseColumn;

    @FXML
    private TableColumn<StudentRequest, String> emailColumn;
    @FXML
    private TableColumn<?, ?> actionColumn;


    @FXML
    private TableColumn<StudentRequest, String> fullnameColumn;

    @FXML
    private TableColumn<StudentRequest, Integer> idColumn;
//    ObservableList<StudentRequest> studentRequestsObeservableList = FXCollections.observableArrayList();
    final ObservableList<StudentRequest> studentRequestsObeservableList=FXCollections.observableArrayList(new StudentRequest());

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    courseColumn.setCellValueFactory(new PropertyValueFactory<StudentRequest,String>("course"));
    emailColumn.setCellValueFactory(new PropertyValueFactory<StudentRequest,String>("email"));
    fullnameColumn.setCellValueFactory(new PropertyValueFactory<StudentRequest,String>("fullName"));
        idColumn.setCellValueFactory(new PropertyValueFactory<StudentRequest,Integer>("id"));
    studentTable.setItems(studentRequestsObeservableList);
    studentTable.getColumns().addAll(courseColumn,emailColumn,fullnameColumn,idColumn);
    }

    @FXML
    void addStudent(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addStudentDialog.fxml"));
        Parent parent = fxmlLoader.load();
        Subject dialogController = fxmlLoader.<Subject>getController();
//        dialogController.setAppMainObservableList(tvObservableList);

        Scene scene = new Scene(parent, 640, 450);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }



}
