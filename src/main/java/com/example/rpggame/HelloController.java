package com.example.rpggame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


import java.io.IOException;

public class HelloController {

    @FXML
    private Button ennemisButton;


    @FXML private javafx.scene.control.Button closeButton;



    @FXML
    private Button closeGame;

    @FXML
    private Button playButton;







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

    @FXML
    protected void startGameRPG (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) playButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fourth-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("C'est parti !");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }




    @FXML
    protected void closeAllGame (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) closeGame.getScene().getWindow();
        stage.close();
        stage1.close();
    }

}



