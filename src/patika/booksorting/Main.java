package patika.booksorting;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Set<Book> bookSet = readySet(null);

        for (Book book : bookSet) {
            System.out.println(book.getName());
        }

        Comparator<Book> bookComparator = new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getPageNo() - o2.getPageNo();
            }
        };

        Set<Book> bookSet2 = readySet(bookComparator);

        System.out.println("--------------");
        for (Book book : bookSet2) {
            System.out.println(book.getName());
        }

    }

    public static Set<Book> readySet(Comparator comparator) {
        Set<Book> bookSet;
        if (comparator != null) {
            bookSet = new TreeSet<>(comparator);
        } else {
            bookSet = new TreeSet<>();
        }

        Book book1 = new Book("The Stranger", 123, "Albert Camus", LocalDate.of(1943,1,1));
        Book book2 = new Book("The Man in the High Castle", 240, "Philip K. Dick", LocalDate.of(1962,10,1));
        Book book3 = new Book("Do Androids Dream of Electric Sheep?", 210, "Philip K. Dick", LocalDate.of(1968,1,1));
        Book book4 = new Book("Flow My Tears, the Policeman Said", 231, "Philip K. Dick", LocalDate.of(1974,2,1));
        Book book5 = new Book("Frankenstein; or, The Modern Prometheus", 280, "Mary Shelley", LocalDate.of(1818,1,1));

        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);

        return bookSet;
    }
}
