package Lesson9;

public class AnimalTester {

    public static void main(String[] args) {

        Cat tom = new Cat("Tom");
        Dog spike = new Dog("Spike");

        tom.eat("mouse");
        tom.eat("fish", 2);

        spike.sleep(2);

        Cat noNamedCat = new Cat();

        noNamedCat.eat("milk");

        Animal[] animals = new Animal[4];
        Animal jerryMouse = new Animal ("Jerry");
        animals[0] = jerryMouse;
        animals[1] = tom;
        animals[2] = spike;
        animals[3] = noNamedCat;

        System.out.println("====Polmorphism example ====");
        for (Animal animal : animals) {
            animal.eat("milk");
        }
    }
}