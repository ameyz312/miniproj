import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void rootTruePositive(){
        assertEquals("Finding Root for True Positive", 3, calculator.squareRoot(9), DELTA);
        assertEquals("Finding Root for True Positive", 2, calculator.squareRoot(4), DELTA);
    }

    @Test
    public void rootFalsePositive(){
        assertNotEquals("Finding Root for False Positive", 4, calculator.squareRoot(9), DELTA);
        assertNotEquals("Finding Root for False Positive", 3, calculator.squareRoot(4), DELTA);
    }

    @Test
    public void factTruePositive(){
        assertEquals("Finding Factorial for True Positive", 24, calculator.factorial(4), DELTA);
        assertEquals("Finding Factorial for True Positive", 120, calculator.factorial(5), DELTA);
    }

    @Test
    public void factFalsePositive(){
        assertNotEquals("Finding Factorial for False Positive", 12, calculator.factorial(4), DELTA);
        assertNotEquals("Finding Factorial for False Positive", 24, calculator.factorial(5), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding Log for True Positive", 0, calculator.naturalLog(1), DELTA);
        assertEquals("Finding Log for True Positive", 0, calculator.naturalLog(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding Log for False Positive", 1, calculator.naturalLog(1), DELTA);
        assertNotEquals("Finding Log for False Positive", 0, calculator.naturalLog(2), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 27, calculator.power(3, 3), DELTA);
        assertEquals("Finding power for True Positive", 16, calculator.power(4, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for True Positive", 16, calculator.power(3, 3), DELTA);
        assertNotEquals("Finding power for True Positive", 27, calculator.power(4, 1), DELTA);
    }


}
