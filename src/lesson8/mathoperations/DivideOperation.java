package lesson8.mathoperations;

public class DivideOperation implements MathOperation {
    @Override
    public double compute(double a, double b) {
        return a / b;
    }
}
