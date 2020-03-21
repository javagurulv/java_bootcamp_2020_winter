package lesson9;

import java.util.Scanner;

public class SafeDisplayProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password for new safe: ");
        int newPassword = sc.nextInt();

        Safe safe = new Safe(newPassword);

        while (true) {

            System.out.println("Program menu: ");
            System.out.println("1. Put money");
            System.out.println("2. Get money");
            System.out.println("3. Exit");

            System.out.println("Enter operation number: ");
            int userOperation = sc.nextInt();

            if (userOperation == 1) {
                System.out.println("Enter password: ");
                int password = sc.nextInt();
                System.out.println("Enter money to put: ");
                int moneyToPut = sc.nextInt();

                boolean result = safe.putMoney(password, moneyToPut);
                if (result == true) {
                    System.out.println("Operation successful!");
                } else {
                    System.out.println("Operation failed!");
                }
            }
            if (userOperation == 2) {
                System.out.println("Enter password: ");
                int password = sc.nextInt();
                System.out.println("Enter money to get: ");
                int moneyToGet = sc.nextInt();

                boolean result = safe.getMoney(password, moneyToGet);
                if (result == true) {
                    System.out.println("Operation successful!");
                } else {
                    System.out.println("Operation failed!");
                }
            }
            if (userOperation == 3) {
                System.out.println("Thank you! By by!");
                break;
            }
        }


    }

}
