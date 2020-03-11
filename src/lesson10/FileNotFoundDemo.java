package lesson10;

public class FileNotFoundDemo {

    public static void main(String[] args) {
        //FileNotFoundException e = new FileNotFoundException("dfsdf");
        //throw e;
        try {
            throw new FileNotFoundException("dfsdf");
        } catch (FileNotFoundException e) {
            System.out.println("Catched!");
            System.out.println("File name = " + e.getFileName());
        } finally {
            System.out.println("Finally was executed!");
        }
        System.out.println("End of program!");
    }

}
