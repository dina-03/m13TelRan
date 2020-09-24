package de.telran.data;

import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private int birthDate;
    private String address;
    private Sex sex;

    public Person(String firstName, String lastName, int birthDate, String address, Sex sex) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.address = address;
        this.sex = sex;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthDate() {
        return birthDate;
    }

    public String getAddress() {
        return address;
    }

    public Sex getSex() {
        return sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Person person = (Person) o;
        return birthDate == person.birthDate &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                address.equals(person.address) &&
                sex == person.sex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, birthDate, address, sex);
    }

    @Override
    public String toString() {
        return "Client: " +
                ", " + firstName +
                ", " + lastName +
                ", BD: " + birthDate +
                ", address: " + address +
                ", (" + sex + ")" +
                ';';
    }

    public String toStringName() {
        return "Client: " + firstName + " " + lastName;
    }

    public String toStringSex() {
        return "Client: " + firstName + " " + lastName + " (" + sex + ")" + "\n";
    }

    public static void displayPersons(Person[] clients){
        for (Person p : clients) {
            System.out.println(p.toStringName());
        }
    }

    public static void split() {
        System.out.println(".-.-.-.-.-.-.-.-.");
    }
}
