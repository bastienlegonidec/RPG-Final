package com.example.rpggame;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import rpgconsole.Game;

import java.io.IOException;
import java.net.URL;

public class SecondController {



    public AnchorPane Pannel;


    @FXML
    private Button closeButton;

    @FXML
    private Button returnButton2;
    private Stage primaryStage;


    @FXML
    protected void returnTo1 (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton2.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());

        stage.setTitle("Menu");

        stage.setScene(scene);
        stage.show();
        stage1.close();
    }





    @FXML
    protected void affHero(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton2.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("third-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Heros");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    @FXML
    protected void affBibli(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton2.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fourth-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bibliothèque");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }



}

