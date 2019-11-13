package Lesson10Hometask2;

public class Car {

    String name;
    String engine;

    Car (String name, String engine) {
        this.name = name;
        this.engine = engine;
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
