package lesson3;

public class Book extends Object {

    private String author;
    private String title;

    Book() {

    }

    public Book(String author) {
        this.author = author;
    }

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }



    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (author != null ? !author.equals(book.author) : book.author != null) return false;
        return title != null ? title.equals(book.title) : book.title == null;
    }

    @Override
    public int hashCode() {
        int result = author != null ? author.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        return result;
    }

    public static void main(String[] args) {
        Car car = new Car("sdfds");
        Book b1 = new Book("A", "Title1");

        String b1InText = b1.toString();
        System.out.println(b1InText);

        System.out.println(b1);

        Book b2 = new Book("A", "Title1");
        boolean equalsResult = b1.equals(b2);
        System.out.println(equalsResult);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String newAuthor) {
        this.author = newAuthor;
    }

    public void open() {
        System.out.println(author + " is open!");
    }

    public void close() {
        System.out.println(author + " is closed!");
    }

}
