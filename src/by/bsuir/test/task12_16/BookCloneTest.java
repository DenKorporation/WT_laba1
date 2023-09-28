package by.bsuir.test.task12_16;

import by.bsuir.main.task12_16.Book;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BookCloneTest {
    @Test
    void General() {
        Book book = new Book("ABCD","ABC",5, 135);
        Book copybook = (Book) book.clone();
        Assertions.assertEquals(book,copybook);
    }
}