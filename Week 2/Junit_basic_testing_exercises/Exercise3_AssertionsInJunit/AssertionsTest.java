import org.junit.Test;
import static org.junit.Assert.*;

public class AssertionsTest {

    @Test
    public void testAssertions() {
        // Assert that 2 + 3 equals 5
        assertEquals(5, 2 + 3);

        // Assert that a condition is true
        assertTrue(5 > 3);

        // Assert that a condition is false
        assertFalse(5 < 3);

        // Assert that an object is null
        Object obj = null;
        assertNull(obj);

        // Assert that an object is not null
        Object nonNullObj = new Object();
        assertNotNull(nonNullObj);
    }
}
