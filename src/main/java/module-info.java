module com.example.javafx0312 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafx0312 to javafx.fxml;
    exports com.example.javafx0312;
}