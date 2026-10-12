/**
 * Provides the core operations for the scientific calculator.
 */
public class Calculator {

    public double add(double left, double right) {
        return left + right;
    }

    public double subtract(double left, double right) {
        return left - right;
    }

    public double multiply(double left, double right) {
        return left * right;
    }

    public double divide(double dividend, double divisor) {
        if (divisor == 0.0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return dividend / divisor;
    }

    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double squareRoot(double value) {
        if (value < 0.0) {
            throw new IllegalArgumentException("Cannot calculate the square root of a negative number");
        }
        return Math.sqrt(value);
    }
}
