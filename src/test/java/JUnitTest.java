import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

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
    @Test
    public void testIsBirthdayToday_True() {
        // Arrange
        Person person = new Person("Minh nguyen", 31, LocalDate.of(1993,1,25));
        person.setBirthday(LocalDate.now()); // Set the birthday to today

        // Act
        boolean result = person.isBirthdayToday();

        // Assert
        assertEquals(true, result, "Birthday should match today's date.");
    }

//    @Test
//    public void testIsBirthdayToday_False() {
//        // Arrange
//        YourClass instance = new YourClass();
//        instance.setBirthday(LocalDate.of(2000, 1, 1)); // Set birthday to a different date (e.g., Jan 1st)
//
//        // Act
//        boolean result = instance.isBirthdayToday();
//
//        // Assert
//        assertFalse(result, "Birthday should not match today's date.");
//    }
//
//    @Test
//    public void testIsBirthdayToday_DifferentYearSameMonthDay() {
//        // Arrange
//        YourClass instance = new YourClass();
//        LocalDate today = LocalDate.now();
//        instance.setBirthday(LocalDate.of(1990, today.getMonth(), today.getDayOfMonth())); // Same month and day, different year
//
//        // Act
//        boolean result = instance.isBirthdayToday();
//
//        // Assert
//        assertTrue(result, "Birthday should match today's date regardless of the year.");
//    }

}
