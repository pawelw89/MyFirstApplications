package Lesson10Hometask2;

public class FuelCar extends Car implements Tankable{

    FuelCar(String name, String engine) {
        super(name, engine);
    }

    @Override
    public void tank() {
        System.out.println("Car has been tanked");
    }

}
