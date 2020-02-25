package lesson6.ex1;

public class WhileOddChecker {

    public static void main(String[] args) {
        int i = 1;
        while (i <= 50) {
            System.out.println(i);
            i = i + 2;
        }

        /*int i = 1;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }*/
    }

}
