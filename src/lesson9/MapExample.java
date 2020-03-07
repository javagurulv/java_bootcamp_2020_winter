package lesson9;

import lesson3.Book;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Integer> words = new HashMap<>();

        System.out.println("Is Empty = " + words.isEmpty());
        System.out.println("Size = " + words.size());

        String cat = new String("Cat");
        String dog = new String("Dog");

        words.put(cat, 1);
        words.put(dog, 9);
        words.put("Cat", 10);

        System.out.println("Size = " + words.size());
        System.out.println("Is Empty = " + words.isEmpty());

        Set<String> keys = words.keySet();
        for (String key : keys) {
            Integer value = words.get(key);
            System.out.println("Key = " + key + " Value = " + value);
        }

        Map<Book, String> booksToZanr = new HashMap<>();
        Book book1 = new Book("Author1", "Title1");
        Book book2 = new Book("Author2", "Title2");

        booksToZanr.put(book1, "Fantazi");
        booksToZanr.put(book2, "Detective");

        for(Book book : booksToZanr.keySet()) {
            String zanr = booksToZanr.get(book);
            System.out.println(book + " Zanr = " + zanr);
        }

        System.out.println("-----------------------");

        booksToZanr.remove(book1);
        for(Book book : booksToZanr.keySet()) {
            String zanr = booksToZanr.get(book);
            System.out.println(book + " Zanr = " + zanr);
        }

        System.out.println("Contains key = " + booksToZanr.containsKey(book2));

        booksToZanr.clear();
    }

}
