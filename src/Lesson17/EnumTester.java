package Lesson17;

public class EnumTester {
    public static void main(String[] args) {
       Person jan = new Person("Jan", Sex.MAN);
       Person ola = new Person("Ola", Sex.WOMAN);
       Person other = new Person("Other", Sex.OTHER);

       printSex(other);

       if(ola.getSex().equals(Sex.WOMAN)) {
           System.out.println("Ola is woman");
       }

        Planet p = Planet.EARTH;
        System.out.println(p.name() + " radius:" + p.getRadius() + " km");

        System.out.println(Planet.EARTH.getEquatorLength());

        System.out.println(Planet.VENUS);

        System.out.println(Planet.VENUS.compareTo(Planet.EARTH));

        System.out.println(Planet.MARS.name());

        System.out.println(Planet.MARS.ordinal());

        Planet planet = Planet.valueOf("EARTH");
        System.out.println(planet);
        Planet[] planets = Planet.values();
        System.out.println(planets);
    }

    private static void printSex(Person person) {
        System.out.println(person.getSex());
    }

}
