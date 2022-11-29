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
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Text affAll;






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
        affAll.setText("Nom : " + tempGame.getEnemy1().getName() + "\n" + "Points de vie : " + tempGame.getEnemy1().getHealthPoints() + "\n" + "Force : " + tempGame.getEnemy1().getStrength() + "\n" + "Mana : " + tempGame.getEnemy1().getMana() + "\n" + "Défense : " + tempGame.getEnemy1().getDefense());
    }


    @FXML
    public void affEnnemi2() throws IOException {
        Game tempGame1 = Game.game;
        affAll.setText("Nom : " + tempGame1.getEnemy2().getName() + "\n" + "Points de vie : " + tempGame1.getEnemy2().getHealthPoints() + "\n" + "Force : " + tempGame1.getEnemy2().getStrength() + "\n" + "Mana : " + tempGame1.getEnemy2().getMana() + "\n" + "Défense : " + tempGame1.getEnemy2().getDefense());
    }

    @FXML
    public void affEnnemi3() throws IOException {
        Game tempGame1 = Game.game;
        affAll.setText("Nom : " + tempGame1.getEnemy3().getName() + "\n" + "Points de vie : " + tempGame1.getEnemy3().getHealthPoints() + "\n" + "Force : " + tempGame1.getEnemy3().getStrength() + "\n" + "Mana : " + tempGame1.getEnemy3().getMana() + "\n" + "Défense : " + tempGame1.getEnemy3().getDefense());
    }

    @FXML
    public void affEnnemi4() throws IOException {
        Game tempGame1 = Game.game;
        affAll.setText("Nom : " + tempGame1.getEnemy4().getName() + "\n" + "Points de vie : " + tempGame1.getEnemy4().getHealthPoints() + "\n" + "Force : " + tempGame1.getEnemy4().getStrength() + "\n" + "Mana : " + tempGame1.getEnemy4().getMana() + "\n" + "Défense : " + tempGame1.getEnemy4().getDefense());
    }





    @FXML
    public void affBoss() throws IOException {
        Game tempGame1 = Game.game;
        affAll.setText("Nom : " + tempGame1.getEnemyBoss().getName() + "\n" + "Points de vie : " + tempGame1.getEnemyBoss().getHealthPoints() + "\n" + "Force : " + tempGame1.getEnemyBoss().getStrength() + "\n" + "Mana : " + tempGame1.getEnemyBoss().getMana() + "\n" + "Défense : " + tempGame1.getEnemyBoss().getDefense());
    }















}
