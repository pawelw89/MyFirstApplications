package AdventureGame;

public class Zombie extends Enemy {

    public Zombie(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Zombie() {
    }

    public Zombie(String name) {
        super(name);
        health = 120;
        damage = 30;
    }
}
