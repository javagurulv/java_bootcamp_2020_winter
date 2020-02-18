package lesson4;

public class TrainTest {

    public static void main(String[] args) {
        TrainTest testRunner = new TrainTest();
        testRunner.test1();
        testRunner.test2();
        testRunner.test3();
    }

    public void test1() {
        Train victim = new Train("Coal", 30);

        victim.ignition();
        victim.speedUp();

        int expectedResult = 10;
        int actualResult = victim.getCurrentSpeed();

        check(actualResult, expectedResult, "Test1");
    }

    public void test2() {
        Train victim = new Train("Electric", 100);

        victim.ignition();
        victim.addCart();
        victim.addCart();
        victim.addCart();
        victim.addCart();
        int expectedResult = 4;
        int actualResult = victim.getCartCount();

        check(actualResult, expectedResult, "Test2");
    }

    public void test3() {
        Train victim = new Train("Electric", 100);

        victim.ignition();
        victim.ignition();
        boolean actualResult = victim.isEngineOn();

        check(actualResult, "Test3");
    }

    public void check(int actualResult, int expectedResult, String testName) {
        if (actualResult == expectedResult) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed!");
            System.out.println("Expected " + expectedResult + " but was " + actualResult);
        }
    }

    public void check(boolean state, String testName) {
        if (state) {
            System.out.println(testName + " has passed!");
        } else {
            System.out.println(testName + " has failed");
        }
    }
}
