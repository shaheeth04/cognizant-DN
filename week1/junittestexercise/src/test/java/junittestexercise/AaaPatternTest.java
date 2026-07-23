package junittestexercise;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AaaPatternTest {

    private int number;

    @Before
    public void setUp() {
        number = 10;
    }

    @After
    public void tearDown() {
        number = 0;
    }

    @Test
    public void testAdditionWithArrangeActAssert() {
        int firstValue = 5;
        int secondValue = 3;

        int result = firstValue + secondValue;

        assertEquals(8, result);
        assertTrue(number > 0);
    }
}
