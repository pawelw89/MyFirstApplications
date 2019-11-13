package Lesson10Hometask2;

public class HybridCar extends Car implements Tankable, Chargeable {

    HybridCar(String name, String engine) {
        super(name, engine);
    }

    @Override
    public void charge() {
        System.out.println("Car hase been charged");
    }

    @Override
    public void tank() {
        System.out.println("Car has been tanked");
    }
}
