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

public class Student implements Initializable {
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
    private List<StudentRequest> studentList;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fullnameColumn = new TableColumn<StudentRequest, String>();
        courseColumn =new TableColumn<StudentRequest, String>();
        emailColumn=new TableColumn<StudentRequest, String>();
        
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
        Scene scene = new Scene(parent, 640, 450);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }


    public void setColumnProperty() {



//
//        fullnameColumn.setCellValueFactory(new Callback<CellDataFeatures<Person, String>, ObservableValue<String>>() {
//            public ObservableValue<String> call(CellDataFeatures<Person, String> p) {
//                // p.getValue() returns the Person instance for a particular TableView row
//                return p.getValue().firstNameProperty();
//            }
//        });
//    }
        courseColumn.setCellValueFactory(new PropertyValueFactory<StudentRequest,String>("course"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<StudentRequest,String>("email"));
        fullnameColumn.setCellValueFactory(new PropertyValueFactory<StudentRequest,String>("fullName"));
        idColumn.setCellValueFactory(new PropertyValueFactory<StudentRequest,Integer>("id"));
        studentTable.setItems(studentRequestsObeservableList);
//        studentTable.getColumns().addAll(courseColumn,emailColumn,fullnameColumn,idColumn);
    }



}
