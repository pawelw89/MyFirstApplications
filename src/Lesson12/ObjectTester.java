package Lesson12;

public class ObjectTester {
    public static void main(String[] args) throws CloneNotSupportedException {
        Adress adress = new Adress("Krakow", "Szpitalna", "1");
        Person kowalski = new Person ("Jan", "Kowalski", adress);
        System.out.println(kowalski.toString());

        Person janKowalski = new Person ("Jan", "Kowalski", adress);
        System.out.println(kowalski.equals(janKowalski));
        System.out.println(kowalski == janKowalski);
        System.out.println(kowalski.equals(5));
        System.out.println(kowalski.equals(null));

        Person clonnedKowalski = kowalski.clone();
        System.out.println(clonnedKowalski);
        System.out.println(kowalski.getAdress());
        System.out.println(clonnedKowalski.getAdress());

        adress.setStreet("Pawia");
        System.out.println(kowalski.getAdress());
        System.out.println(clonnedKowalski.getAdress());

    }
}
