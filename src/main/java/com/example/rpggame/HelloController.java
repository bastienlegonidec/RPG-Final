package com.example.rpggame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;
import rpgconsole.Hero;
import rpgconsole.Hunter;
import rpgconsole.Warrior;

import java.awt.event.MouseEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class HelloController {

    @FXML
    private Button ennemisButton;
    @FXML private javafx.scene.control.Button closeButton;




    public HelloController() {
    }


    @FXML
    protected void onChangeScenebuttonClicked(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) closeButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Vos héros");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    @FXML
    protected void ennemisButtonClicked (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) ennemisButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("third-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Vos énnemis");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }
}



