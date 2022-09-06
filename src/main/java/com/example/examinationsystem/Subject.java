package com.example.examinationsystem;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.DialogPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Subject implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
    @FXML
    private DialogPane addStudentDialog;

    private ObservableList<Subject> tvObservableList = FXCollections.observableArrayList();

    @FXML
    void addSubject(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("addSubjectDialog.fxml"));
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
