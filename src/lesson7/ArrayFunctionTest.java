package lesson7;

public class ArrayFunctionTest {

    public static final double PVN = 21;

    public static int counter = 0;

    private boolean isSuccess = true;

    public static void main(String[] args) {
        ArrayFunctionTest test = new ArrayFunctionTest();
        test.testSum();
        test.testFindMinValue();

        testSum();
    }

    public static void testSum() {
        ArrayFunction arrayFunction = new ArrayFunction();

        int[] arr = {1, 2, 3};
        int expectedResult = 6;
        int actualResult = arrayFunction.sum(arr);

        double income = 1000;
        double tax = income / 100 * PVN;

        if (expectedResult == actualResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }

    public void testFindMinValue() {
        ArrayFunction arrayFunction = new ArrayFunction();

        int[] arr = {1, 2, 3};
        int expectedResult = 1;
        int actualResult = arrayFunction.findMinValue(arr);

        if (expectedResult == actualResult) {
            System.out.println("OK");
        } else {
            System.out.println("FAIL");
        }
    }


}
