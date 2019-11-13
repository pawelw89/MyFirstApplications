package Lesson7;

import Lesson7.Cat;
import org.w3c.dom.ls.LSOutput;

public class CatTester {

    public static void main(String[] args) {

        Cat javaCat = new Cat("Tom");
        System.out.println("Cat name is " + javaCat.name);

        System.out.println(javaCat.name + " drink milk");
        javaCat.eat("milk");
        boolean isHungry = true;

        System.out.println(javaCat.name + " eat mouse");
        javaCat.eat("mouse");

        javaCat.play("ball");

        javaCat.sleeping(5);

    }
}



