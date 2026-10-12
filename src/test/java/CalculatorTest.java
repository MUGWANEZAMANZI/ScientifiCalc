import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void performsBasicArithmetic() {
        assertEquals(8.0, calculator.add(5.0, 3.0));
        assertEquals(2.0, calculator.subtract(5.0, 3.0));
        assertEquals(15.0, calculator.multiply(5.0, 3.0));
        assertEquals(5.0 / 3.0, calculator.divide(5.0, 3.0));
    }

    @Test
    void rejectsDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> calculator.divide(5.0, 0.0));
    }

    @Test
    void calculatesPower() {
        assertEquals(32.0, calculator.power(2.0, 5.0));
    }

    @Test
    void calculatesSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9.0));
        assertEquals(0.0, calculator.squareRoot(0.0));
    }

    @Test
    void rejectsSquareRootOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1.0));
    }
}
