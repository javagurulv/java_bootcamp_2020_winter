package lesson2;

import java.util.Scanner;

public class GreetingProgram {

    public static void main(String[] args) {
        System.out.println("Please enter your name:");

        // запросить у пользователя имя
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();

        // вывести приветствие с именем
        System.out.println("Hi " + userName);

    }

}
