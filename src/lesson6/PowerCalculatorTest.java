package lesson6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class PowerCalculatorTest {

    @Test
    public void testPow1() {
        PowerCalculator victim = new PowerCalculator();

        int expectedResult = 8;
        int actualResult = victim.pow(2,3);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPow2() {
        PowerCalculator victim = new PowerCalculator();

        int expectedResult = 27;
        int actualResult = victim.pow(3,3);
        assertEquals(expectedResult, actualResult);
    }

}