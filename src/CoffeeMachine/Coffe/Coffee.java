package CoffeeMachine.Coffe;

public class Coffee {
    String name;
    int coffee;
    int water;
    int milk;

    public Coffee(String name, int coffee, int water, int milk) {
        this.name = name;
        this.coffee = coffee;
        this.water = water;
        this.milk = milk;
    }

    public Coffee(){

    }

    @Override
    public String toString() {
        return "Coffee{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }
}
