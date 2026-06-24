package junittestexercise;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SetupTest {

    @Test
    public void testSetup() {
        System.out.println("JUnit is working perfectly!");
        assertEquals(4, 2 + 2);
    }
}
