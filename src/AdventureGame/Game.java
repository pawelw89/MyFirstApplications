package AdventureGame;

import java.util.Random;
import java.util.Scanner;

public class Game {

    public static void main(String[] args) {

        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the dungeon");

        Player player = new Player();

        Skeleton skeleton = new Skeleton("Skeleton");
        Zombie zombie = new Zombie("Zombie");
        Orc orc = new Orc("Orc");
        Enemy[] enemies = {skeleton, zombie, orc};

        GAME:
        while (player.running) {
            System.out.println("-------------------------------------");

            Enemy newEnemy = enemies[rand.nextInt(enemies.length)];
            String enemyName = newEnemy.getName();
            System.out.println("\t# " + enemyName + " has appeared! #\n");

            while (newEnemy.health > 0) {

                System.out.println("Your HP is " + player.getHealth() + " and damage " + player.getDamage());
                System.out.println(enemyName + " HP is " + newEnemy.getHealth() + " and damage " + newEnemy.getDamage() + "\n");

                System.out.println("What would you like to do?");
                System.out.println("\t1 Attack!");
                System.out.println("\t2 Drink health potion (+30 HP)");
                System.out.println("\t3 Run!");

                String input = in.nextLine();
                if (input.equals("1")) {
                    newEnemy.setHealth(newEnemy.getHealth() - player.getDamage());
                    System.out.println("\tFight!!");
                    System.out.println("You attacked for " + player.getDamage());

                    if (newEnemy.getHealth() <= 0) {
                        System.out.println("Enemy defeated!");
                        System.out.println("You have " + player.getHealth() + " HP left");
                        if (rand.nextInt(100) < player.getHealthPiotionDropRate()) {
                            player.numberOfPotions++;
                            System.out.println("The enemy dropped the potion \n You have " + player.getNumberOfPotions() + " potion(s) now");
                        } else {
                            System.out.println("Nothing have been found");
                        } break;
                    }

                    System.out.println("Enemy HP is " + newEnemy.getHealth() + " now");

                    player.setHealth(player.getHealth() - newEnemy.getDamage());
                    System.out.println("Enemy attacked for " + newEnemy.getDamage());
                    System.out.println("Your HP is " + player.getHealth() + " now \n");

                    if (player.health <= 0) {
                        System.out.println("You are defeated!");
                        break GAME;
                    }
                } else if (input.equals("2")) {
                    if (player.getNumberOfPotions() > 0) {
                        player.setHealth(player.getHealth() + player.healthPotionAmount);
                        player.setNumberOfPotions(player.getNumberOfPotions() - 1);
                        System.out.println("You drink a health potion. Your HP is " + player.getHealth() + " now");
                        System.out.println("Remaining potions: " + player.getNumberOfPotions());
                    } else {
                        System.out.println("You have no potions!");
                    }
                } else if (input.equals("3")) {
                    System.out.println("You have escaped");
                    continue GAME;
                } else {
                    System.out.println("Invalid command!");
                }
            }

            System.out.println("-------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("\t1 Countinue exploring the dungeon");
            System.out.println("\t2 Exit the dungeon");

            String input2 = in.nextLine();
            if (input2.equals("1")) {
                System.out.println("You continue your adventure");
            } else if (input2.equals("2")) {
                System.out.println("You exit the dungeon");
                player.running = false;
            } else {
                System.out.println("Invalid command!");
            }
        }
        System.out.println("\n#################################");
        System.out.println("Thanks for playing!");
        System.out.println("#################################");
    }
}
