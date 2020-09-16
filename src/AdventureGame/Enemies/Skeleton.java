package AdventureGame.Enemies;

public class Skeleton extends Enemy{

    public Skeleton(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Skeleton() {
    }

    public Skeleton(String name) {
        super(name);
        health = 100;
        damage = 40;
    }
}
