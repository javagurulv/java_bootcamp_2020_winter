package lesson10;

public class FileNotFoundException extends RuntimeException {

    private String fileName;

    public FileNotFoundException(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

}
