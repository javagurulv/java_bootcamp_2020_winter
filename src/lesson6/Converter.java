package lesson6;

public class Converter {

    public static void main(String[] args) {
        Converter converter = new Converter();
        converter.convert(7);
    }

    public void convert(int number) {
        String result = "";
        do {
            result = number % 2 + result;
            System.out.println("Number: " + number);
            System.out.println("Result: " + result);
            number = (number - (number % 2)) / 2;
        } while (number != 0);
        System.out.println("Result: " + result);
    }
}
