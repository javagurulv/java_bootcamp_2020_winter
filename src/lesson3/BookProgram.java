package lesson3;

public class BookProgram {

    public static void main(String[] args) {
        Book firstBook = new Book("Vasja");

        String author = firstBook.getAuthor();
        if (author.equals("Vasja")) {
            firstBook.open();
            firstBook.open();
            firstBook.open();
            firstBook.open();
        }

        int x = 10;

        if ((x > 10) && (x < 20)) {

        } else {

        }


        firstBook.setAuthor("Tolstoi");

        firstBook.open();
        firstBook.close();

        Book secondBook = new Book("Petja");
        secondBook.open();
        secondBook.close();
        secondBook.close();
        secondBook.close();
        secondBook.close();
    }

}
