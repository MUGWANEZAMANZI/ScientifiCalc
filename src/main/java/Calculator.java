import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Provides the core operations for the scientific calculator.
 */
public class Calculator {

    private static final Logger LOGGER = Logger.getLogger(Calculator.class.getName());

    public double add(double left, double right) {
        double result = left + right;
        logOperation("add", left, right, result);
        return result;
    }

    public double subtract(double left, double right) {
        double result = left - right;
        logOperation("subtract", left, right, result);
        return result;
    }

    public double multiply(double left, double right) {
        double result = left * right;
        logOperation("multiply", left, right, result);
        return result;
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0.0) {
            ArithmeticException exception = new ArithmeticException("Cannot divide by zero");
            LOGGER.log(Level.SEVERE, "Division failed: {0}", exception.getMessage());
            throw exception;
        }
        double result = dividend / divisor;
        logOperation("divide", dividend, divisor, result);
        return result;
    }

    public double powerOfTwo(double value) {
        double result = value * value;
        logOperation("powerOfTwo", value, result);
        return result;
    }

    public double power(double base, double exponent) {
        double result = Math.pow(base, exponent);
        logOperation("power", base, exponent, result);
        return result;
    }

    public double squareRoot(double value) {
        if (value < 0.0) {
            IllegalArgumentException exception =
                    new IllegalArgumentException("Cannot calculate the square root of a negative number");
            LOGGER.log(Level.SEVERE, "Square root failed: {0}", exception.getMessage());
            throw exception;
        }
        double result = Math.sqrt(value);
        logOperation("squareRoot", value, result);
        return result;
    }

    private void logOperation(String operation, double input, double result) {
        LOGGER.log(Level.INFO, "{0}({1}) = {2}", new Object[]{operation, input, result});
    }

    private void logOperation(String operation, double left, double right, double result) {
        LOGGER.log(Level.INFO, "{0}({1}, {2}) = {3}", new Object[]{operation, left, right, result});
    }
}
