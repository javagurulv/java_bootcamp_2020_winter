package lesson8.mathoperations;

import lesson8.Bicycle;

public class MathOperationsDemo {

    public static void main(String[] args) {
        MathOperation mathOperation = new MyMathOperation();

        System.out.println(mathOperation.compute(5,5));
        System.out.println(mathOperation.compute(3,2));
        System.out.println(mathOperation.compute(8,5));
        System.out.println(mathOperation.compute(5,7));

//        OperationExecutor executor = new OperationExecutor();
//        MultiplyOperation multiplyOperation = new MultiplyOperation();
//        AdditionOperation additionOperation = new AdditionOperation();
//        SubtractionOperation subtractionOperation = new SubtractionOperation();
//        MathOperation[] mathOperations = {multiplyOperation, additionOperation, subtractionOperation};

//        executor.execute(mathOperations, 2, 5);



        //Check protected field from Bicycle example
        Bicycle bicycle = new Bicycle("Old bicycle", 10);
//        bicycle.brand // Not possible to see this filed, because it's protected (not accessible from another package or through child of class Bicycle)
    }
}
