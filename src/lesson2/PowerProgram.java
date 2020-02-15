package lesson2;

import java.util.Scanner;

public class PowerProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your a number:");
        int number = scanner.nextInt();

        int result = number * number;

        System.out.println("Result = " + result);

    }

}
