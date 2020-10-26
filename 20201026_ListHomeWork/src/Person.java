import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public Address getAddress() {
        return address;
    }
    public static List<Address> getAddressesByList(List<Person> persons){
        List<Address> addresses = new ArrayList<>();
        for (Person p : persons) {
            addresses.add(p.address);
        }
        return addresses;
    }
}
