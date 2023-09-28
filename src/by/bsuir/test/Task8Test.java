package by.bsuir.test;

import by.bsuir.main.Task8;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task8Test {
    @Test
    void General() {
        int[] a = {0, 4, 6, 7};
        int[] b = {2, 3, 5};
        int[] indexes = {1, 1, 2};
        Assertions.assertArrayEquals(indexes, Task8.findIndexes(a, b));
    }

    @Test
    void EmptyArrayA() {
        int[] a = {};
        int[] b = {2, 3, 5};
        int[] indexes = {0, 0, 0};
        Assertions.assertArrayEquals(indexes, Task8.findIndexes(a, b));
    }

    @Test
    void EmptyArrayB() {
        int[] a = {0, 4, 6, 7};
        int[] b = {};
        int[] indexes = {};
        Assertions.assertArrayEquals(indexes, Task8.findIndexes(a, b));
    }

    @Test
    void ArrayABeforeArrayB() {
        int[] a = {0, 1, 2, 3};
        int[] b = {4, 5, 6};
        int[] indexes = {4, 4, 4};
        Assertions.assertArrayEquals(indexes, Task8.findIndexes(a, b));
    }

    @Test
    void ArrayAAfterArrayB() {
        int[] a = {4, 5, 6, 7};
        int[] b = {1, 2, 3};
        int[] indexes = {0, 0, 0};
        Assertions.assertArrayEquals(indexes, Task8.findIndexes(a, b));
    }
}