import org.junit.Test;
import static org.junit.Assert.*;
public class MyFirstTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testAdditionMethod(){
        int input1 = 5;
        int input2 = 12;
        int expetedSum = 17;


    assertEquals(expetedSum, calculator.addition(input1, input2));
    }

    @Test
    public void tipCalculatorTest(){
        double cost = 100.50;
        double tip = 10;
        double expected  = 10.05;

        assertNotEquals(cost, cost + calculator.calculatorTip(cost, tip));
        assertEquals(expected, calculator.calculatorTip(cost, tip), 0.01);
    }
}
