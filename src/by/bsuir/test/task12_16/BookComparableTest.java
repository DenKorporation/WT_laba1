package by.bsuir.test.task12_16;

import by.bsuir.main.task12_16.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class BookComparableTest {
    int size = 10;
    Book[] books = new Book[size];
    @Test
    void compareTo() {
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            books[i] = new Book("title", "author", 5, rnd.nextInt(Integer.MAX_VALUE));
        }
        Arrays.sort(books);
        Assertions.assertTrue(check(books));
    }

    boolean check(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            if (books[i].getIsbn() > books[i + 1].getIsbn()) {
                return false;
            }
        }
        return true;
    }
}