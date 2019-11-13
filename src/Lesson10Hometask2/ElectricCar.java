package Lesson10Hometask2;

public class ElectricCar extends Car implements Chargeable{

    ElectricCar(String name, String engine) {
        super(name, engine);
    }

    @Override
    public void charge() {
        System.out.println("Car has been charged");
    }


}
