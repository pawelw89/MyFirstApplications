package Lesson12;

public class Person implements Cloneable {
    private String firstName;
    private String lastName;
    private Adress adress;


    public Person(String firstName, String lastName, Adress adress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.adress = adress;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Adress getAdress() {
        return adress;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof Person) {
            Person another = (Person) obj;
            return this.firstName.equals(another.firstName) &&
                    this.lastName.equals(another.lastName);
        }
        return false;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + adress;
    }

    @Override
    protected Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}
