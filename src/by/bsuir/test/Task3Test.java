package by.bsuir.test;

import by.bsuir.main.Task3;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task3Test {

    @Test
    void General() {
        double[][] expected = new double[6][2];
        double[][] actual = Task3.calculate(0, 1, 0.2);

        double current = 0;
        for (int i = 0; i < expected.length; i++, current += 0.2) {
            expected[i][0] = current;
            expected[i][1] = Math.tan(current);
        }

        for (int i = 0; i < expected.length; i++) {
            Assertions.assertArrayEquals(expected[i], actual[i]);
        }
    }
}