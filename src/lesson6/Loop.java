package lesson6;

public class Loop {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //pre();
    }


    public static void pre() {
        int i = 1;
        int x = getX();

        while (i <= x) {
            if (i > 50) {
                break;
            }
            System.out.println(i);
            i++;
        }
    }

    public static int getI() {
        return 11;
    }

    public static int getX() {
        return 100;
    }

    public static void post() {
        int i = getI();

        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

}
