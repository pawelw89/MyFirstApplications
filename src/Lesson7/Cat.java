package Lesson7;

public class Cat {
    String name;
    boolean isHungry;
    boolean sleeping;
    boolean play;

    Cat(String name) {
        this.name = name;
        isHungry = false;
    }

        void eat(String food) {
            isHungry = false;
            System.out.println(name + " is not hungry after eating");
        }

        boolean isHungry() {
        return isHungry;
    }

    void play(String toy) {
        isHungry = true;
        System.out.println(name + " is playing " + toy);
        }

    void sleeping(int i) {
        System.out.println(name + " is sleeping " + i + " hours");
        System.out.println(name + " is hungry");
    }
}


