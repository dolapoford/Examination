package com.example.examinationsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HelloApplication extends Application {
    public static  Stage stage=null;
    @Override
    public void start(Stage stage) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader);
        stage.initStyle(StageStyle.UNDECORATED);
//        stage.setTitle("Dashboard");
        this.stage=stage;

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}