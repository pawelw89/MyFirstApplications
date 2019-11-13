package Lesson10;

public class AnimalTester {
    public static void main(String[] args) {
        // Animal animal = new Animal();
        Animal cat = new Cat();
        Dog dog = new Dog();
        Feline anotherCat = new Cat();
        Canine anotherDog = new Dog();

        moveAnimal(cat);
        moveAnimal(dog);
        moveAnimal(anotherCat);
        moveAnimal(anotherDog);
    }

    public static void moveAnimal(Animal animal){
        animal.move();
    }
}
