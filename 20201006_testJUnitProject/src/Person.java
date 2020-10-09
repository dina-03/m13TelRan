public class Person {
    private String firstName;
    private String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    //petya,ivanov
    public static Person createPerson(String lastAndFirstName) {
        String[] strings = lastAndFirstName.split(",");
        return new Person(strings[0], strings[1]);
    }
}
