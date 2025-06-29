import static org.junit.Assert.assertEquals;

import org.junit.*;
public class SimpleInterestTest {
    private SimpleInterest si;
    @Before
    public void setUp() {
        si = new SimpleInterest(); // Arrange: create object
        System.out.println("Setup done.");
    }

    // Teardown: runs AFTER each test
    @After
    public void tearDown() {
        si = null;  // Free up resources
        System.out.println("Teardown done.\n");
    }

    @Test
    public void test_SI() {
        // Arrange is already done in setUp()

        // Act
        int result = si.Calculate_SI(20000, 05, 2);

        // Assert
        assertEquals(2000, result);
    }
}
