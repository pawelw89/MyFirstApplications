package Lesson17;

public class Person {
    private String firstName;
    private Sex sex;

    public Person(String firstName, Sex sex) {
        this.firstName = firstName;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", sex=" + sex +
                '}';
    }
}
