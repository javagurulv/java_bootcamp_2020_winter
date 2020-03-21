package lesson9;

public class SafeTest {

    public static void main(String[] args) {
        SafeTest safeTest = new SafeTest();
        safeTest.shouldPutMoneyWhenPasswordIsCorrect();
        safeTest.shouldNotPutMoneyWhenPasswordIsIncorrect();
    }

    public void shouldPutMoneyWhenPasswordIsCorrect() {
        Safe safe = new Safe(1234);
        boolean result = safe.putMoney(1234, 10);
        if (result == true) {
            System.out.println("OK!");
        } else {
            System.out.println("FAIL!");
        }
    }

    public void shouldNotPutMoneyWhenPasswordIsIncorrect() {
        Safe safe = new Safe(1234);
        boolean result = safe.putMoney(9999, 10);
        if (result == false) {
            System.out.println("OK!");
        } else {
            System.out.println("FAIL!");
        }
    }


}
