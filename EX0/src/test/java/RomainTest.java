import org.example.RumanNumeral;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class RomainTest {
    @Test
    public void Testconvert() {
        RumanNumeral r = new RumanNumeral();
        assertEquals(1, r.convert("I"));
        assertEquals(4, r.convert("IV"));
        assertEquals(5, r.convert("V"));

    }

    @Test
    public void testConvertModified() {
        RumanNumeral rumen = new RumanNumeral();
        assertEquals(1, rumen.convertModified("I"));
        assertEquals(3, rumen.convertModified("II"));
        assertEquals(4, rumen.convertModified("IV"));
        assertEquals(5, rumen.convertModified("V"));

    }
}
