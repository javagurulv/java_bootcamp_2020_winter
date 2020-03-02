package lesson8.mathoperations;

public class OperationExecutor {

    void execute(MathOperation[] operations, double a, double b) {
        for (MathOperation mathOperation : operations) {
            System.out.println(mathOperation.compute(a, b));
        }
    }
}
