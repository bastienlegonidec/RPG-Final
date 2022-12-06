package rpgconsole;//Program made by Bastien Le Gonidec

import java.util.Scanner;

public class Game {



    public static Game game = new Game ();
    private Hero c1 = new Warrior("hero_1",100,20,0,50);
    private Hero c2 = new Hunter("hero_2",100,27,20,30);
    private Hero c3 = new Hero("hero_3",100,25,30,45);
    private Hero c4 = new Hero("hero_4",100,20,0,50);


    public void setC1(Hero c1) {
        this.c1 = c1;
    }

    public void setC2(Hero c2) {
        this.c2 = c2;
    }

    public void setC3(Hero c3) {
        this.c3 = c3;
    }

    public void setC4(Hero c4) {
        this.c4 = c4;
    }

    public void setEnemy1(Enemy enemy1) {
        this.enemy1 = enemy1;
    }

    public void setEnemy2(Enemy enemy2) {
        this.enemy2 = enemy2;
    }

    public Hero getC1() {
        return c1;
    }

    public Hero getC2() {
        return c2;
    }

    public Hero getC3() {
        return c3;
    }

    public Hero getC4() {
        return c4;
    }

    public Enemy getEnemy1() {
        return enemy1;
    }

    public Enemy getEnemy2() {
        return enemy2;
    }




    Enemy enemy1 = new Enemy("enemy_1",100,40,10,47);
    Enemy enemy2 = new Enemy("enemy_2",100,60,4,38);

    Enemy enemy3 = new Enemy("enemy_3", 100, 30, 5, 30);
    Enemy enemy4 = new Enemy("enemy_4", 100, 15, 3, 18);
    Enemy enemyBoss = new Enemy("enemy_boss", 200, 70, 40, 50);

    public Enemy getEnemy3() {
        return enemy3;
    }

    public void setEnemy3(Enemy enemy3) {
        this.enemy3 = enemy3;
    }

    public Enemy getEnemy4() {
        return enemy4;
    }

    public void setEnemy4(Enemy enemy4) {
        this.enemy4 = enemy4;
    }

    public Enemy getEnemyBoss() {
        return enemyBoss;
    }

    public void setEnemyBoss(Enemy enemy) {
        this.enemyBoss = enemy;
    }






    public static void Play() {


        Scanner scan = new Scanner(System.in);


        Combatant combatant = new Combatant("hh",55,5,5,5);







        //create weapon
        Sword sword = new Sword();
        Axe axe = new Axe();
        HealingStick healingStick = new HealingStick();

        //create item
        Apple apple = new Apple();
        ManaPotion manaPotion = new ManaPotion();



        game.c1.addArmory(sword);
        game.c1.addArmory(axe);
        game.c1.addInventory(apple);
        game.c1.addInventory(manaPotion);

        game.c2.addInventory(manaPotion);

        game.c3.addArmory(axe);
        game.c3.addArmory(healingStick);

        game.c4.addArmory(sword);


        Team team = new Team();
        team.addHero(game.c1);
        team.addHero(game.c2);
        team.addHero(game.c3);
        team.addHero(game.c4);




        Horde horde = new Horde();
        horde.addEnemy(game.enemy1);
        horde.addEnemy(game.enemy2);


        System.out.println("Your team :" );
        team.printHero();

        System.out.println();
        System.out.println("Enemy team :");
        horde.printEnemy();



        int turn = 0;
        while (horde.isDead()==false){
            System.out.println("\n");
            System.out.println("It's the turn of " + team.getHero(turn).getName());
            System.out.print("He has " + team.getHero(turn).getHealthPoints()  + " hp and " );
            System.out.println(team.getHero(turn).getMana() + " mana.");

            //action du hero
            boolean choiceDone = false;
            while (choiceDone==false){
                System.out.println("Do you want to see the inventory (1), interact (2) or use an item (3)?");
                System.out.print("Type 1, 2 or 3 : ");
                int choice = scan.nextInt();
                if (choice==1){
                    team.getHero(turn).printInventory();
                    System.out.println("\n");
                }

                else if (choice==2){
                    choiceDone = true;

                    System.out.println("Do you want to target your team(1) or the enemy team(2)? ");
                    System.out.print("Type 1 or 2 : ");
                    int choice2 = scan.nextInt();
                    if (choice2==1){
                        System.out.println("Your team is composed of : ");
                        team.printHero();
                        System.out.println("Witch one do you want to target? ");
                        System.out.print("Type his number ");
                        int target = scan.nextInt();
                        team.getHero(turn).interact(team.getHero(target-1));
                    }

                    else if (choice2==2){
                        System.out.println("The enemy team is composed of : ");
                        horde.printEnemy();
                        System.out.println("Witch one do you want to target? ");
                        System.out.print("Type his number ");
                        int target = scan.nextInt();
                        team.getHero(turn).interact(horde.getEnemy(target-1));
                        horde.getEnemy(target-1).updateAlive();
                        if (horde.getEnemy(target-1).getIsAlive()==false){
                            System.out.println(horde.getEnemy(target-1).getName() + " is dead");
                            horde.removeEnemy(horde.getEnemy(target-1));}


                    }

                    System.out.println("\n");

                }

                else if (choice==3){
                    choiceDone = true;
                    team.getHero(turn).consume();
                }

                else{
                    System.out.println("Instruction unclear");
                    System.out.println("\n");
                }
            }


            //update turn
            if(turn< team.getSize()-1){turn++;}
            else {turn=0;}


        }


        System.out.println("\n" + "\n" + "\n");
        System.out.println("You defeated the enemy team");


    }
}
