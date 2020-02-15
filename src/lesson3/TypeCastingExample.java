package lesson3;

public class TypeCastingExample {

    public static void main(String[] args) {
        short number = 72;
        char symbol = '&';

        System.out.println(number + " -> " + (char) number);
        System.out.println(symbol + " -> " + (short) symbol);
    }
}
