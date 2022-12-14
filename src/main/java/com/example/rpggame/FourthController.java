package com.example.rpggame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import rpgconsole.Game;
import rpgconsole.Horde;
import rpgconsole.Team;
import rpgconsole.Combatant;

import java.io.IOException;

import static rpgconsole.Game.*;

public class FourthController {



    @FXML
    protected Button returnButton;

    @FXML
    private Text TextInventaire;

    @FXML
    private Text TextArmes;

    @FXML
    protected void returntoMenu (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    @FXML
    protected void affHero (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("third-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Héros");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    @FXML
    protected void returnToMenu2(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }


    @FXML
    public void affInventaire() throws IOException {
        TextInventaire.setText("hero 1: ");
    }



    @FXML
    public void AffArmes() throws IOException {

        TextArmes.setText("Héro 1 : " + Game.getH1().getArmory() +"\n" + "Héro 2 : " + Game.getH2().getArmory()+"\n" + "Héro 3 : " + Game.getH3().getArmory()+"\n" + "Héro 4 : " + Game.getH4().getArmory());



    }










}
