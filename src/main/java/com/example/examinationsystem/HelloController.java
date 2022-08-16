package com.example.examinationsystem;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {



    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private Button btnUpdate;

    @FXML
    private TableColumn<?, ?> courseColomn;

    @FXML
    private TableColumn<?, ?> idColomn;

    @FXML
    private TableView<?> idTable;

    @FXML
    private TableColumn<?, ?> nameColomn;

    @FXML
    private TableColumn<?, ?> phoneColomn;

    @FXML
    void onAdd(ActionEvent event) {

    }

    @FXML
    void onDelete(ActionEvent event) {

    }

    @FXML
    void onUpdate(ActionEvent event) {

    }

    @FXML
    private ImageView myImage;

    @FXML
    private ImageView myImageTwo;



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}