package by.bsuir.test;

import by.bsuir.main.Task1;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task1Test {

    @Test
    void PositiveValue() {
        Assertions.assertEquals(3.7, Task1.calculate(3.5, 2.5), 0.05);
    }

    @Test
    void NegativeValue() {
        Assertions.assertEquals(-3.3, Task1.calculate(-3.5, -2.5), 0.05);
    }

    @Test
    void ZeroValue() {
        Assertions.assertEquals(0.5, Task1.calculate(0, 0), 0.05);
    }
}