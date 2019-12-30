package Lesson7Hometask3;


public class CarTester {
    public static void main(String[] args) {

        Engine diesel = new Engine ("Diesel", 130, 2000, false);
        Car vw = new Car("Volkswagen", diesel, 50);

        vw.drive(100,50);
        vw.startEngine();
        vw.startEngine();
        vw.drive(100,50);

    }
}
