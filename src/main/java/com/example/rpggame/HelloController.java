package com.example.rpggame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;


import java.io.IOException;

public class HelloController {


    @FXML
    private ImageView imageMain;
    @FXML
    private javafx.scene.control.Button closeButton;


    @FXML
    private Button closeGame;

    @FXML
    private Button playButton;


    @FXML
    protected void goMainPage(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) playButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Main page");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }


    @FXML
    protected void closeAllGame(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) closeGame.getScene().getWindow();
        stage.close();
        stage1.close();
    }
}

