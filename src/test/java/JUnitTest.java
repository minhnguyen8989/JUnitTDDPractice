import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class JUnitTest {

    //Calculator Class Test
    @Test
    public void testAddition() {
        Calculator calculator = new Calculator();
        int result = calculator.add(2, 3);
        assertEquals(5, result, "Addition should return the sum of the two numbers");
    }
    @Test
    public void testSubtraction() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(5, 3);
        assertEquals(2, result, "Subtraction should return the difference of the two numbers");
    }

    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(5, 3);
        assertEquals(15, result, "Multiplication should return the difference of the two numbers");
    }
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(6,3);
        assertEquals(2, result, "Divide should return the difference of the two numbers");
    }


    //Person Class Test
}
