package com.example.rpggame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import rpgconsole.Game;

import java.io.IOException;

public class ThirdController {
    @FXML
    private Button returnButton3;


    @FXML
    private Text affAll;





    @FXML
    protected void returnToMenu (ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton3.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }

    @FXML
    protected void affBibli(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton3.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("fourth-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Bibliothèque");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }


    @FXML
    protected void returnToMenu2(ActionEvent event) throws IOException {
        Stage stage = new Stage();
        Stage stage1 = (Stage) returnButton3.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("second-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Menu");
        stage.setScene(scene);
        stage.show();
        stage1.close();
    }
/*

    @FXML
    public void affHero1() throws IOException {
        Game tempGame = Game.game;
        affAll.setText("Name : " + tempGame.getC1().getName() + "\n" + "Points de vie : " + tempGame.getC1().getHealthPoints() + "\n" + "Force : " + tempGame.getC1().getStrength() + "\n" + "Mana : " + tempGame.getC1().getMana() + "\n" + "Défense : " + tempGame.getC1().getDefense());
    }

    public void affHero2() throws IOException {
        Game tempGame1 = Game.game;
        affAll.setText("Name : " + tempGame1.getC2().getName()+ "\n" + "Points de vie : " + tempGame1.getC2().getHealthPoints() + "\n" + "Force : " + tempGame1.getC2().getStrength() + "\n" + "Mana : " + tempGame1.getC2().getMana() + "\n" + "Défense : " + tempGame1.getC2().getDefense());
    }

    public void affHero3() throws IOException {
        Game tempGame2 = Game.game;
        affAll.setText("Name : " + tempGame2.getC3().getName()+ "\n" + "Points de vie : " + tempGame2.getC3().getHealthPoints() + "\n" + "Force : " + tempGame2.getC3().getStrength() + "\n" + "Mana : " + tempGame2.getC3().getMana() + "\n" + "Défense : " + tempGame2.getC3().getDefense());
    }

    public void affHero4() throws IOException {
        Game tempGame3 = Game.game;
        affAll.setText("Name : " + tempGame3.getC4().getName()+ "\n" + "Points de vie : " + tempGame3.getC4().getHealthPoints() + "\n" + "Force : " + tempGame3.getC4().getStrength() + "\n" + "Mana : " + tempGame3.getC4().getMana() + "\n" + "Défense : " + tempGame3.getC4().getDefense());

    }*/




}
