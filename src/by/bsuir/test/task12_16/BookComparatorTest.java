package by.bsuir.test.task12_16;

import by.bsuir.main.task12_16.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.util.Arrays;
import java.util.Random;

class BookComparatorTest {
    Book[] books;

    @BeforeEach
    void setUp() {
        books = new Book[]{new Book("A", "ert", 5, 135), new Book("A", "dft", 4, 135),
                new Book("C", "dfg", 5, 135), new Book("A", "erq", 6, 135),
                new Book("A", "ert", 2, 135), new Book("B", "khj", 10, 135),
                new Book("Q", "ert", 1, 135), new Book("D", "dfg", 5, 135),
                new Book("C", "erq", 6, 135), new Book("A", "zxc", 2, 135)};
    }

    @Test
    void titleComparator() {
        Book[] result = {new Book("A", "ert", 5, 135), new Book("A", "dft", 4, 135),
                new Book("A", "erq", 6, 135), new Book("A", "ert", 2, 135),
                new Book("A", "zxc", 2, 135), new Book("B", "khj", 10, 135),
                new Book("C", "dfg", 5, 135), new Book("C", "erq", 6, 135),
                new Book("D", "dfg", 5, 135), new Book("Q", "ert", 1, 135)};
        Arrays.sort(books, new TitleComparator());
        Assertions.assertArrayEquals(result, books);
    }

    @Test
    void titleAuthorComparator() {
        Book[] result = {new Book("A", "dft", 4, 135), new Book("A", "erq", 6, 135),
                new Book("A", "ert", 5, 135), new Book("A", "ert", 2, 135),
                new Book("A", "zxc", 2, 135), new Book("B", "khj", 10, 135),
                new Book("C", "dfg", 5, 135), new Book("C", "erq", 6, 135),
                new Book("D", "dfg", 5, 135), new Book("Q", "ert", 1, 135)};
        Arrays.sort(books, new TitleAuthorComparator());
        Assertions.assertArrayEquals(result, books);
    }

    @Test
    void authorTitleComparator() {
        Book[] result = {new Book("C", "dfg", 5, 135), new Book("D", "dfg", 5, 135),
                new Book("A", "dft", 4, 135), new Book("A", "erq", 6, 135),
                new Book("C", "erq", 6, 135), new Book("A", "ert", 5, 135),
                new Book("A", "ert", 2, 135), new Book("Q", "ert", 1, 135),
                new Book("B", "khj", 10, 135), new Book("A", "zxc", 2, 135)};
        Arrays.sort(books, new AuthorTitleComparator());
        Assertions.assertArrayEquals(result, books);
    }

    @Test
    void fullComparator() {
        Book[] result = {new Book("C", "dfg", 5, 135), new Book("D", "dfg", 5, 135),
                new Book("A", "dft", 4, 135), new Book("A", "erq", 6, 135),
                new Book("C", "erq", 6, 135), new Book("A", "ert", 2, 135),
                new Book("A", "ert", 5, 135), new Book("Q", "ert", 1, 135),
                new Book("B", "khj", 10, 135), new Book("A", "zxc", 2, 135)};
        Arrays.sort(books, new FullComparator());
        Assertions.assertArrayEquals(result, books);
    }
}