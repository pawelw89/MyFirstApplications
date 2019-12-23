package Lesson20;

public class AnnotationTester {
    public static void main(String[] args) {
        Person person = new Person("Jan", "Kowalski");
        Class<? extends Person> aClass = person.getClass();
        if (aClass.isAnnotationPresent(Student.class)) {
            System.out.println("Class Person annotated with @Student");
            Student studentAnnotation = aClass.getAnnotation(Student.class);
            System.out.printf("student's age: %d, class name: %s%n", studentAnnotation.age(), studentAnnotation.className());
        }

        Animal animal = new Animal();
        if (animal.getClass().isAnnotationPresent(Mammal.class)) {
            System.out.println("Animal is annotated with @Mammal");
        }

        Cat cat = new Cat();
        if (cat.getClass().isAnnotationPresent(Mammal.class)) {
            System.out.println("Cat is annotated with @Mammal");
        }
    }
}
