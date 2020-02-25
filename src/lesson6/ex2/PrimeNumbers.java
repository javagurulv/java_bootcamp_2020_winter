package lesson6.ex2;

public class PrimeNumbers {

    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 2; i <= 500; i++) {
            if ((i == 17) || (i == 71)) {
                continue;
            }
            if (isPrime(i)) {
                System.out.println(i);
                count++;
                sum += i;
                if (count == 50) {
                    break;
                }
            }
        }

        System.out.println("sum = " + sum + " count = " + count);
    }

    public static boolean isPrime(int number) {
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

}
