module com.example.rpggame {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.rpggame to javafx.fxml;
    exports com.example.rpggame;
}