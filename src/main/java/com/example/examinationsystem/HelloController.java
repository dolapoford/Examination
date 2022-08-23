package com.example.examinationsystem;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.util.Duration;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private Pane content_area;
    @FXML
    private AnchorPane main_pane;

    @FXML
    void open_signup(MouseEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("signup.fxml"));
       content_area.getChildren().removeAll();
       content_area.getChildren().setAll(fxml);

    }

    @FXML
    void open_student(ActionEvent event) throws IOException {
        Parent fxml = FXMLLoader.load(getClass().getResource("studentdata.fxml"));
        main_pane.getChildren().removeAll();
        main_pane.getChildren().setAll(fxml);
    }
    @FXML
    void open_dashboard(ActionEvent event) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("student.fxml"));
        HelloApplication.stage.getScene().setRoot(fxmlLoader);
    }

    @FXML
    void close_button(MouseEvent event) {
System.exit(0);
    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {



    }

}