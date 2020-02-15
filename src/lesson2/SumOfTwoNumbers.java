package lesson2;

import java.util.Scanner;

public class SumOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter your second number:");
        int secondNumber = scanner.nextInt();

        int result = firstNumber + secondNumber;

        System.out.println("Result = " + result);

    }

}
