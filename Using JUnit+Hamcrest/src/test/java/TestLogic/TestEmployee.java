package TestLogic;

import Logic.Employee;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestEmployee {

    @Test
    public void testConstructor() {
        final long id = 13;
        final String firstName = " Harry";
        final String lastName = " Potter";
        final String country = "England";
        final int age = 32;

        final Employee emp = new Employee(id, firstName, lastName, country, age);

        assertThat(id, equalTo(emp.id));
        assertThat(firstName,equalTo(emp.firstName));
        assertThat(lastName, equalTo(emp.lastName));
        assertThat(country, equalTo(emp.country));
        assertThat(age, equalTo(emp.age));
    }

}
