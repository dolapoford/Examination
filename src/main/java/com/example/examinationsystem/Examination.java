package com.example.examinationsystem;

import com.example.examinationsystem.model.ExamRequest;
import com.example.examinationsystem.model.StudentRequest;
import com.example.examinationsystem.store.Database;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class Examination implements Initializable {
    @FXML
    private TableView<ExamRequest> examTable;

    @FXML
    private TableColumn<ExamRequest, Long> durationColumn;

    @FXML
    private TableColumn<ExamRequest, Void> takeExam;

    @FXML
    private TableColumn<ExamRequest, String> courseColumn;

    @FXML
    private TableColumn<ExamRequest, Integer> examId;
    ObservableList<ExamRequest> examRequestsObeservableList;
    private Database data;
    private Integer number;
    private List<ExamRequest> examList;
    private Stage stage;
    private Scene scene;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        examRequestsObeservableList = FXCollections.observableArrayList();
        data = new Database();
        examList = new ArrayList<>();
        setColumnProperty();
        addButtonToTable();
        examRequestsObeservableList.addAll(Database.listExam());
        examTable.setItems(examRequestsObeservableList);


    }

    @FXML
    void addStudent(ActionEvent event) {

    }

    @FXML
    void addExam(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("examDialog.fxml"));
        Parent parent = fxmlLoader.load();
//        Examination dialogController = fxmlLoader.<Examination>getController();
        Examination dialogController = fxmlLoader.getController();
//        dialogController.setAppMainObservableList(tvObservableList);

        Scene scene = new Scene(parent, 642, 567);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void setColumnProperty() {


        courseColumn.setCellValueFactory(new PropertyValueFactory<>("course"));
//        takeExam.setCellValueFactory(new PropertyValueFactory<>("email"));
        examId.setCellValueFactory(new PropertyValueFactory<>("examId"));
        durationColumn.setCellValueFactory(new PropertyValueFactory<>("duration"));
        examTable.setItems(examRequestsObeservableList);

    }

    private void addButtonToTable() {
        takeExam=new TableColumn<>();
        Callback<TableColumn<ExamRequest, Void>, TableCell<ExamRequest, Void>> cellFactory = new Callback<TableColumn<ExamRequest, Void>, TableCell<ExamRequest, Void>>() {

            @Override
            public TableCell<ExamRequest, Void> call(TableColumn<ExamRequest, Void> examRequestVoidTableColumn) {
                final TableCell<ExamRequest, Void> cell = new TableCell<ExamRequest, Void>() {
                    private final Button btn = new Button("Action");

                    {
                        btn.setOnAction((ActionEvent event) -> {
                            Parent root = null;
                            try {
                                root = FXMLLoader.load(getClass().getResource("examinationPage.fxml"));
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            stage =(Stage) ((Node)event.getSource()).getScene().getWindow();
                            scene = new Scene(root);
                            stage.setScene(scene);
                            stage.show();
                        });
                    }

                    @Override
                    public void updateItem(Void item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            setGraphic(null);
                        } else {
                            setGraphic(btn);
                        }

                    }

                };
                return cell;
            }
        };
        takeExam.setCellFactory(cellFactory);
        examTable.getColumns().add(takeExam);

    }
}
