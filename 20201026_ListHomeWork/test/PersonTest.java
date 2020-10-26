import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void getAddressesByListPerson() {
        List<Person> personList = new ArrayList<>(Arrays.asList(new Person("Vasya", new Address("street10", 5)),
                new Person("Petya", new Address("street12", 10))));
        List<Address> addressList = Person.getAddressesByList(personList);
        List<Address> expectedAddress = Arrays.asList(new Address("street10", 5), new Address("street12", 10));
        Assert.assertEquals(expectedAddress, addressList);
        Assert.assertEquals(expectedAddress.size(), addressList.size());
    }

}