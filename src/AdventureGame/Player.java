package AdventureGame;

public class Player {
    int health = 100;
    int damage = 50;
    int numberOfPotions = 3;
    int healthPotionAmount = 30;
    int healthPiotionDropRate = 50;
    boolean running = true;

    public Player() {
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getNumberOfPotions() {
        return numberOfPotions;
    }

    public void setNumberOfPotions(int numberOfPotions) {
        this.numberOfPotions = numberOfPotions;
    }

    public int getHealthPotionAmount() {
        return healthPotionAmount;
    }

    public void setHealthPotionAmount(int healthPotionAmount) {
        this.healthPotionAmount = healthPotionAmount;
    }

    public int getHealthPiotionDropRate() {
        return healthPiotionDropRate;
    }

    public void setHealthPiotionDropRate(int healthPiotionDropRate) {
        this.healthPiotionDropRate = healthPiotionDropRate;
    }

    public boolean isRunning() {
        return running;
    }

    public void setRunning(boolean running) {
        this.running = running;
    }
}
