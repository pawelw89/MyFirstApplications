package Lesson7Hometask;

public class MobilePhoneTester {

    public static void main(String[] args) {

        MobilePhone samsung = new MobilePhone("Samsung", "Galaxy", 1000, 500);

        samsung.installApp("Google maps", 100);

        samsung.installApp("Tinder", 200);

        samsung.installApp("Pokemon GO", 250);

        samsung.use("YouTube", 5);

        samsung.use("Facebook", 6);

        samsung.use("Angry Birds", 2);

        samsung.charge();

        samsung.use("Angry Birds", 2);

    }
}
