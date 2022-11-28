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

public class SecondController {

    @FXML
    private Text affHero1;

    @FXML
    private Text affHero2;

    @FXML
    private Text affHero3;

    @FXML
    private Text affHero4;

    @FXML
    private Button closeButton;

    @FXML
    private Button returnButton2;


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
    public void onHero1clicked() throws IOException {
        Game tempGame = Game.game;
        affHero1.setText("Nom : " + tempGame.getC1().getName() + "\n" + "Points de vie : " + tempGame.getC1().getHealthPoints() + "\n" + "Force : " + tempGame.getC1().getStrength() + "\n" + "Mana : " + tempGame.getC1().getMana() + "\n" + "Défense : " + tempGame.getC1().getDefense());
    }

    public void onHero2clicked() throws IOException {
        Game tempGame1 = Game.game;
        affHero2.setText("Name : " + tempGame1.getC2().getName()+ "\n" + "Points de vie : " + tempGame1.getC2().getHealthPoints() + "\n" + "Force : " + tempGame1.getC2().getStrength() + "\n" + "Mana : " + tempGame1.getC2().getMana() + "\n" + "Défense : " + tempGame1.getC2().getDefense());
    }

    public void onHero3clicked() throws IOException {
        Game tempGame2 = Game.game;
        affHero3.setText("Name : " + tempGame2.getC3().getName()+ "\n" + "Points de vie : " + tempGame2.getC3().getHealthPoints() + "\n" + "Force : " + tempGame2.getC3().getStrength() + "\n" + "Mana : " + tempGame2.getC3().getMana() + "\n" + "Défense : " + tempGame2.getC3().getDefense());
    }

    public void onHero4clicked() throws IOException {
        Game tempGame3 = Game.game;
        affHero4.setText("Name : " + tempGame3.getC4().getName()+ "\n" + "Points de vie : " + tempGame3.getC4().getHealthPoints() + "\n" + "Force : " + tempGame3.getC4().getStrength() + "\n" + "Mana : " + tempGame3.getC4().getMana() + "\n" + "Défense : " + tempGame3.getC4().getDefense());

    }


}

