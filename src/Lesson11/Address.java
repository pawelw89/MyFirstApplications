package Lesson11;

public class Address {
    private int index;
    private String city;
    private String street;
    private int builidngNumber;

    public Address(int index, String city, String street, int builidngNumber) {
        this.index = index;
        this.city = city;
        this.street = street;
        this.builidngNumber = builidngNumber;
    }

    public int getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilidngNumber() {
        return builidngNumber;
    }
}
