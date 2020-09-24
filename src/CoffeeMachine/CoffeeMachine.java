package CoffeeMachine;

public class CoffeeMachine {

    String name;
    int maxWaterCapacity;
    int maxCoffeeCapacity;
    int maxMilkCapacity;
    int currentWaterCapacity;
    int currentCoffeeCapacity;
    int currentMilkCapacity;
    int maxNumberOfCofeeBeforeDescaling;
    int coffeeCounter;

    public CoffeeMachine(String name, int maxWaterCapacity, int maxCoffeeCapacity, int maxMilkCapacity, int maxNumberOfCofeeBeforeDescaling) {
        this.name = name;
        this.maxWaterCapacity = maxWaterCapacity;
        this.maxCoffeeCapacity = maxCoffeeCapacity;
        this.maxMilkCapacity = maxMilkCapacity;
        currentWaterCapacity = maxWaterCapacity;
        currentCoffeeCapacity = maxCoffeeCapacity;
        currentMilkCapacity = maxMilkCapacity;
        this.maxNumberOfCofeeBeforeDescaling = maxNumberOfCofeeBeforeDescaling;
        this.coffeeCounter = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrentWaterCapacity() {
        return currentWaterCapacity;
    }

    public void setCurrentWaterCapacity(int currentWaterCapacity) {
        this.currentWaterCapacity = currentWaterCapacity;
    }

    public int getCurrentCoffeeCapacity() {
        return currentCoffeeCapacity;
    }

    public void setCurrentCoffeeCapacity(int currentCoffeeCapacity) {
        this.currentCoffeeCapacity = currentCoffeeCapacity;
    }

    public int getCurrentMilkCapacity() {
        return currentMilkCapacity;
    }

    public void setCurrentMilkCapacity(int currentMilkCapacity) {
        this.currentMilkCapacity = currentMilkCapacity;
    }

    public int getMaxNumberOfCofeeBeforeDescaling() {
        return maxNumberOfCofeeBeforeDescaling;
    }

    public void setMaxNumberOfCofeeBeforeDescaling(int maxNumberOfCofeeBeforeDescaling) {
        this.maxNumberOfCofeeBeforeDescaling = maxNumberOfCofeeBeforeDescaling;
    }

    public int getCoffeeCounter() {
        return coffeeCounter;
    }

    public void setCoffeeCounter(int coffeeCounter) {
        this.coffeeCounter = coffeeCounter;
    }

}