import org.junit.*;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void createPerson() {
        String lastAndFirstName = "petya,ivanov";
        Person p = Person.createPerson(lastAndFirstName);
        Assert.assertNotNull(p);
        Assert.assertEquals("first name", "petya", p.getFirstName());
        Assert.assertEquals("last name", "ivanov", p.getLastName());
    }
}
