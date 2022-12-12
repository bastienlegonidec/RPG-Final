package rpgconsole;//Program made by Bastien Le Gonidec

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static Hero h1 = new Hunter("Hunter", 100, 50, 10, 2);
    public static Hero h2 = new Warrior("Warrior", 100, 45, 18, 5);
    public static Hero h3 = new Mage("Mage", 100, 59, 10, 4);
    public static Hero h4 = new Healer("Healer", 100, 65, 5, 9);

    public static Hero getH1() {
        return h1;
    }

    public static void setH1(Hero h1) {
        Game.h1 = h1;
    }

    public static Hero getH2() {
        return h2;
    }

    public static void setH2(Hero h2) {
        Game.h2 = h2;
    }

    public static Hero getH3() {
        return h3;
    }

    public static void setH3(Hero h3) {
        Game.h3 = h3;
    }

    public static Hero getH4() {
        return h4;
    }

    public static void setH4(Hero h4) {
        Game.h4 = h4;
    }




    public static void Play() {

        Scanner scanner = new Scanner(System.in);

        // Demande au joueur le nombre de héros
        System.out.println("Combien de héros voulez-vous créer ?");
        int nbHeroes = scanner.nextInt();

        // Création d'un tableau pour stocker les héros
        Hero[] heroes = new Hero[nbHeroes];

        // Demande à chaque joueur de choisir sa classe
        for (int i = 0; i < nbHeroes; i++) {
            System.out.println("Quelle est la classe du héros " + (i + 1) + " ?");
            System.out.println("1. Hunter");
            System.out.println("2. Warrior");
            System.out.println("3. Mage");
            System.out.println("4. Healer");
            int choice = scanner.nextInt();

            // Création du héros en fonction de la classe choisie
            switch (choice) {
                case 1:
                    heroes[i] = h1;
                    break;
                case 2:
                    heroes[i] = h2;
                    break;
                case 3:
                    heroes[i] = h3;
                    break;
                case 4:
                    heroes[i] = h4;
                    break;
                default:
                    System.out.println("Vous devez choisir une classe valide !");
                    i--;
                    break;
            }
        }


        //create weapon
        Sword sword = new Sword();
        Axe axe = new Axe();
        HealingStick healingStick = new HealingStick();

        //create item
        Apple apple = new Apple();
        ManaPotion manaPotion = new ManaPotion();


        h1.addArmory(sword);
        h1.addArmory(axe);
        h1.addInventory(apple);
        h1.addInventory(manaPotion);


        h2.addInventory(manaPotion);

        h3.addArmory(axe);
        h3.addArmory(healingStick);


        h4.addArmory(sword);


        Enemy gobelin = new Enemy("Gobelin", 100, 5, 3, 100);
        Enemy orque = new Enemy("Orque", 100, 8, 4, 12);
        Enemy loupgarou = new Enemy("Loup-garou", 100, 10, 5, 12);
        Enemy troll = new Enemy("Troll", 150, 15, 8, 13);
        Enemy boss = new Enemy("Boss", 200, 20, 20, 14);

        Team team = new Team();
        for (int i = 0; i < nbHeroes; i++) {
            team.addHero(heroes[i]);
        }


        Horde horde = new Horde();
        horde.addEnemy(gobelin);
        horde.addEnemy(orque);
        horde.addEnemy(loupgarou);
        horde.addEnemy(troll);
        //horde.addEnemy(boss);

        System.out.println("Your team :");
        team.printHero();

        System.out.println();
        System.out.println("Enemy team :");
        horde.printEnemy();


        int turn = 0;
        while (!horde.isDead()) {
            System.out.println("\n");


            //action du hero
            boolean choiceDone = false;
            while (!choiceDone) {
                System.out.println("Do you want to see the inventory (1), interact (2) or use an item (3)?");
                System.out.print("Type 1, 2 or 3 : ");
                int choice = scanner.nextInt();
                if (choice == 1) {
                    team.getHero(turn).printInventory();
                    System.out.println("\n");


                } else if (choice == 2) {
                    choiceDone = true;

                    System.out.println("Your team is composed of : ");
                    team.printHero();
                    System.out.println("\n");

                    System.out.println("Witch hero do you want to choose? ");
                    System.out.print("Type his number : ");
                    int choiceHero = scanner.nextInt();
                    System.out.println("It's the turn of " + team.getHero(choiceHero-1).getName());

                    System.out.println("Vous allez affronter un ennemi !");
                    System.out.println("\n");
                    horde.printEnemy();
                    System.out.println("\n");
                    System.out.println("choisi un ennemi : ");
                    int target = scanner.nextInt();

                    team.getHero(turn).interact(horde.getEnemy(target-1));
                    horde.getEnemy(target - 1).updateAlive();




                    // créer attaque ennemi
                    /*
                    team.getHero(turn).interact(horde.getEnemy(target - 1));
                    horde.getEnemy(target - 1).updateAlive();

                     */



                    if (!horde.getEnemy(target - 1).getIsAlive()) {
                        System.out.println(horde.getEnemy(target - 1).getName() + "is dead");
                        horde.removeEnemy(horde.getEnemy(target - 1));


                    }

                    System.out.println("\n");

                }


                /*else if (choice==3){
                    choiceDone = true;
                    team.getHero(turn).consume();
                }

                else{
                    System.out.println("Instruction unclear");
                    System.out.println("\n");
                } */
            }


            //update turn
            if (turn < team.getSize() - 1) {
                turn++;
            } else {
                turn = 0;
            }


        }


    }

}


/*
                else if (choice == 2) {
                    choiceDone = true;
                    System.out.println("Your team is composed of : ");
                    team.printHero();
                    System.out.println("\n");
                    System.out.println("Vous allez affronter un ennemi !");
                    System.out.println("\n");
                    horde.printEnemy();
                    System.out.println("\n");



                    System.out.println("Witch hero do you want to choose? ");
                    System.out.print("Type his number : ");
                    int choiceHero = scanner.nextInt();
                    System.out.println("It's the turn of " + team.getHero(target - 1).getName());
                    team.getHero(target - 1).interact(horde.getEnemy(turn));

                    horde.getEnemy(target - 1).updateAlive();
                    if (horde.getEnemy(target - 1).getIsAlive() == false) {
                        System.out.println(horde.getEnemy(target - 1).getName() + "is dead");
                        horde.removeEnemy(horde.getEnemy(target - 1));


                    }


                    team.getHero(turn).interact(horde.getEnemy(target - 1));
                    horde.getEnemy(target - 1).updateAlive();

                    if (horde.getEnemy(target - 1).getIsAlive() == false) {
                        System.out.println(horde.getEnemy(target - 1).getName() + " is dead");
                        horde.removeEnemy(horde.getEnemy(target - 1));
                    }
                }


                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    System.out.println("Your team is composed of : ");
                    team.printHero();
                    System.out.println("Witch one do you want to target? ");
                    System.out.print("Type his number ");
                    int target = scanner.nextInt();
                    team.getHero(turn).interact(team.getHero(target - 1));
                    team.getHero(turn).interact(horde.getEnemy(target - 1));
                    horde.getEnemy(target - 1).updateAlive();
                    if (horde.getEnemy(target - 1).getIsAlive() == false) {
                        System.out.println(horde.getEnemy(target - 1).getName() + " is dead");
                        horde.removeEnemy(horde.getEnemy(target - 1));
                    }
                } else if (choice2 == 2) {
                    System.out.println("The enemy team is composed of : ");
                    horde.printEnemy();
                    System.out.println("Witch one do you want to target? ");
                    System.out.print("Type his number ");
                    int target = scanner.nextInt();
                    team.getHero(turn).interact(horde.getEnemy(target - 1));
                    horde.getEnemy(target - 1).updateAlive();
                    if (horde.getEnemy(target - 1).getIsAlive() == false) {
                        System.out.println(horde.getEnemy(target - 1).getName() + " is dead");
                        horde.removeEnemy(horde.getEnemy(target - 1));
                    }


                }

                System.out.println("\n");


                if (choice == 3) {
                    choiceDone = true;
                    team.getHero(turn).consume();
                } else {
                    System.out.println("Instruction unclear");
                    System.out.println("\n");
                }
            }


            //update turn
            if (turn < team.getSize() - 1) {
                turn++;
            } else {
                turn = 0;
            }


        }


        System.out.println("\n" + "\n" + "\n");
        System.out.println("You defeated the enemy team");


    }
}*/




