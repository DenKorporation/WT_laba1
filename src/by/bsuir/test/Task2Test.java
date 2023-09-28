package by.bsuir.test;

import by.bsuir.main.Task2;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    void General()
    {
        Assertions.assertTrue(Task2.check(0, 0));
    }

    @Test
    void TopPartInternalPosition()
    {
        Assertions.assertTrue(Task2.checkTopPart(3, 4));
    }

    @Test
    void TopPartExternalPosition()
    {
        Assertions.assertFalse(Task2.checkTopPart(-6, 3));
    }

    @Test
    void TopPartBoundaryPosition()
    {
        Assertions.assertTrue(Task2.checkTopPart(4, 5));
    }

    @Test
    void BottomPartInternalPosition()
    {
        Assertions.assertTrue(Task2.checkBottomPart(-3, -2));
    }

    @Test
    void BottomPartExternalPosition()
    {
        Assertions.assertFalse(Task2.checkBottomPart(4, -5));
    }

    @Test
    void BottomPartBoundaryPosition()
    {
        Assertions.assertTrue(Task2.checkBottomPart(-6, -3));
    }
}