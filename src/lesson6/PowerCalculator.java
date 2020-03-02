package lesson6;

public class PowerCalculator {

    public static void main(String[] args) {
        PowerCalculator powerCalculator = new PowerCalculator();
        int result = powerCalculator.pow(2, 3);
        System.out.println(result);
    }

    public int pow(int number, int pow) {
        int result = 1;
        for (int i = 0; i < pow; i++) {
            result = result * number;
        }
        return result;
    }

}
