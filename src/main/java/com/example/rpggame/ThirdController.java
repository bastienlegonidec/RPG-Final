package com.example.rpggame;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import rpgconsole.*;

import java.io.IOException;

import static rpgconsole.Game.*;

public class ThirdController {

    public MenuItem chooseHunterButton;
    public MenuItem chooseWarriorButton;
    public MenuItem chooseMageButton;
    public MenuItem chooseHealerButton;
    public MenuButton choiceHeroButton;
    @FXML
    public Text textHeroChoisi;
    public Button startGameButton;
    @FXML
    private Button returnButton3;


    @FXML
    private Text affAll;







    @FXML
    protected Hero chooseHunter() throws IOException {
        return h1;
    }


    @FXML
    protected Hero chooseWarrior() throws IOException {
        return h2;
    }

    @FXML
    protected Hero chooseMage() throws IOException {
        return h3;
    }


    @FXML
    protected Hero chooseHealer() throws IOException {

        return h4;
    }



    @FXML
    protected void startAllGame(ActionEvent event) throws IOException {
        textHeroChoisi.setText("vous avez choisi : "  );



    }





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


    @FXML
    public void affHero1() throws IOException {

        affAll.setText("Name : " + Game.getH1().getName() + "\n" + "Points de vie : " + Game.getH1().getHealthPoints() + "\n" + "Force : " + Game.getH1().getStrength() + "\n" + "Mana : " + Game.getH1().getMana() + "\n" + "Défense : " + Game.getH1().getDefense());
    }

    public void affHero2() throws IOException {

        affAll.setText("Name : " + Game.getH2().getName()+ "\n" + "Points de vie : " + Game.getH2().getHealthPoints() + "\n" + "Force : " + Game.getH2().getStrength() + "\n" + "Mana : " + Game.getH2().getMana() + "\n" + "Défense : " + Game.getH2().getDefense());
    }

    public void affHero3() throws IOException {

        affAll.setText("Name : " + Game.getH3().getName()+ "\n" + "Points de vie : " + Game.getH3().getHealthPoints() + "\n" + "Force : " + Game.getH3().getStrength() + "\n" + "Mana : " + Game.getH3().getMana() + "\n" + "Défense : " + Game.getH3().getDefense());
    }

    public void affHero4() throws IOException {

        affAll.setText("Name : " + Game.getH4().getName()+ "\n" + "Points de vie : " + Game.getH4().getHealthPoints() + "\n" + "Force : " + Game.getH4().getStrength() + "\n" + "Mana : " + Game.getH4().getMana() + "\n" + "Défense : " + Game.getH4().getDefense());

    }




}
