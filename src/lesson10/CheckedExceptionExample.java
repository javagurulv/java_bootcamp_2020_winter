package lesson10;

public class CheckedExceptionExample {

    public static void main(String[] args) {
        try {
            readFile();
        } catch (CheckedException e) {

        }
    }

    public static void readFile() throws CheckedException {
        throw new CheckedException();
    }

}
