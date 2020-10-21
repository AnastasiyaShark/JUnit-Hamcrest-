package TestLogic;

import Logic.Employee;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TestEmployee {

    @Test
    public void testConstructor() {
        final long id = 13;
        final String firstName = " Harry";
        final String lastName = " Potter";
        final String country = "England";
        final int age = 32;

        final Employee emp = new Employee(id, firstName, lastName, country, age);

        Assertions.assertEquals(id, emp.id);
        Assertions.assertEquals(firstName, emp.firstName);
        Assertions.assertEquals(lastName, emp.lastName);
        Assertions.assertEquals(country, emp.country);
        Assertions.assertEquals(age, emp.age);
    }

}
