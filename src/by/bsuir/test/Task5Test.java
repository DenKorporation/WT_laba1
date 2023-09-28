package by.bsuir.test;

import by.bsuir.main.Task5;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task5Test {
    @Test
    void General() {
        int[] arr = {1, 2, 3, 1, 6, 4, 5, 9, 4, 11};
        Assertions.assertEquals(3, Task5.findNumberOfElement(arr));
    }

    @Test
    void DecreasingSequence() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Assertions.assertEquals(9, Task5.findNumberOfElement(arr));
    }

    @Test
    void IncreasingSequence() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Assertions.assertEquals(0, Task5.findNumberOfElement(arr));
    }

    @Test
    void OneElementArray() {
        int[] arr = {5};
        Assertions.assertEquals(0, Task5.findNumberOfElement(arr));
    }

    @Test
    void EmptyArray() {
        int[] arr = {};
        Assertions.assertEquals(0, Task5.findNumberOfElement(arr));
    }
}