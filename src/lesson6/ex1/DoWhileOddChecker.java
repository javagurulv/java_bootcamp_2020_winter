package lesson6.ex1;

public class DoWhileOddChecker {

    public static void main(String[] args) {
        /*int i = 1;

        do {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        } while (i <= 50);*/

        int i = 1;

        do {
            System.out.println(i);
            i = i + 2;
        } while (i <= 50);
    }

}
