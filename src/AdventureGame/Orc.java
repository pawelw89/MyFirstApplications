package AdventureGame;

public class Orc extends Enemy{

    public Orc(String name, int health, int damage) {
        super(name, health, damage);
    }
    public Orc() {
    }
    public Orc(String name) {
        super(name);
        health = 80;
        damage = 70;
    }
}
