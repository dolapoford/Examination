package com.example.examinationsystem;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Signup implements Initializable {

    @FXML
    private AnchorPane pane;
    @FXML
    private ComboBox<String> comboBox;

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
}
