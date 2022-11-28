package com.example.rpggame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import rpgconsole.Game;

import java.io.IOException;

public class ThirdController {
    @FXML
    private Button returnButton3;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Text ennemi1text;

    @FXML
    private Text ennemi2text;






    @FXML
    protected void returnTo1 (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton3.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    @FXML
    public void affEnnemi1() throws IOException {
        Game tempGame = Game.game;
        ennemi1text.setText("Nom : " + tempGame.getEnemy1().getName() + "\n" + "Points de vie : " + tempGame.getEnemy1().getHealthPoints() + "\n" + "Force : " + tempGame.getEnemy1().getStrength() + "\n" + "Mana : " + tempGame.getEnemy1().getMana() + "\n" + "Défense : " + tempGame.getEnemy1().getDefense());
    }


    @FXML
    public void affEnnemi2() throws IOException {
        Game tempGame1 = Game.game;
        ennemi2text.setText("Nom : " + tempGame1.getEnemy2().getName() + "\n" + "Points de vie : " + tempGame1.getEnemy2().getHealthPoints() + "\n" + "Force : " + tempGame1.getEnemy2().getStrength() + "\n" + "Mana : " + tempGame1.getEnemy2().getMana() + "\n" + "Défense : " + tempGame1.getEnemy2().getDefense());
    }













}
