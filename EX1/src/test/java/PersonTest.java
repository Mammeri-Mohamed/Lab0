import org.junit.jupiter.api.Test;
import org.example.Person;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PersonTest {

    @Test
    public void testGetFullName() {
        Person per= new Person("Mammeri", "Mohamed", 23);
        String  str= per.getFullName();
        assertEquals("Mammeri Mohamed", str);
    }

    @Test
    public void testIsAdult_Should_be_return_True() {
        Person person = new Person("Mammeri", "Mohamed", 23);
        assertTrue(person.isAdult());
    }
    @Test
    public void testIsAdult_Should_be_return_False(){
        Person person = new Person("Mammeri", "Mohamed", 17);
        assertFalse(person.isAdult());
    }
}