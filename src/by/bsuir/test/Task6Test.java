package by.bsuir.test;

import by.bsuir.main.Task6;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task6Test {

    @Test
    void General() {
        double[] input = new double[]{1, 2, 3, 4, 5};
        double[][] expectation = new double[][]{{1, 2, 3, 4, 5}, {2, 3, 4, 5, 1},
                {3, 4, 5, 1, 2}, {4, 5, 1, 2, 3}, {5, 1, 2, 3, 4}};

        Assertions.assertArrayEquals(expectation, Task6.transform(input));
    }
}