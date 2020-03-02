package lesson8.mathoperations;

public class MyMathOperation implements MathOperation{
    @Override
    public double compute(double a, double b) {
        return a + b + b / a;
    }
}
