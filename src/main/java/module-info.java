module com.example.examinationsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.examinationsystem to javafx.fxml;
    exports com.example.examinationsystem;
}