package lesson10;

public class ExceptionExample {

    public static void main(String[] args) {
        readFile("myFile.txt");
    }

    public static void readFile(String fileName) {
        throw new FileNotFoundException(fileName);
    }

}
