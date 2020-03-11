package lesson10;

public class UncheckedExceptionExample {

    public static void main(String[] args) {
        readFile();
    }

    public static void readFile() throws UncheckedException {
        throw new UncheckedException();
    }

}
