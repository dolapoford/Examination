package com.example.examinationsystem;


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

public class Students implements Initializable{
    @FXML
    private TableView<StudentRequest> studentTable;
    @FXML
    private TableColumn<StudentRequest, String> courseColumn;
    @FXML
    private TableColumn<StudentRequest, String> emailColumn;
    @FXML
    private TableColumn<?, ?> actionColumn;
    private Database data ;
    private  Integer number;
    @FXML
    private TableColumn<StudentRequest, String> fullnameColumn;
    @FXML
    private TableColumn<StudentRequest, Integer> idColumn;
    ObservableList<StudentRequest> studentRequestsObeservableList;
    private ObservableList<StudentRequest> tvObservableList = FXCollections.observableArrayList();
    private List<StudentRequest> studentList;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        studentRequestsObeservableList=FXCollections.observableArrayList();
        data = new Database();
        studentList=new ArrayList<>();
        setColumnProperty();
        studentRequestsObeservableList.addAll(Database.listStudent());
        studentTable.setItems(studentRequestsObeservableList);
//        startTask();


    }

    @FXML
    void addStudent(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addStudentDialog.fxml"));
        Parent parent = fxmlLoader.load();
        Subject dialogController = fxmlLoader.<Subject>getController();
        dialogController.setAppMainObservableList(tvObservableList);
        Scene scene = new Scene(parent, 640, 450);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }


    public void setColumnProperty() {




        courseColumn.setCellValueFactory(new PropertyValueFactory<>("course"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));
        fullnameColumn.setCellValueFactory(new PropertyValueFactory<>("fullName"));
        idColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        studentTable.setItems(studentRequestsObeservableList);

    }


}
