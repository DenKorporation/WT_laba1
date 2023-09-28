package by.bsuir.test;

import by.bsuir.main.Task7;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Task7Test {
    @Test
    void General()
    {
        double[] input = new double[]{3.5, 6.1,0.2,-3.4,7.9, 2.6};
        double[] expected = new double[input.length];
        System.arraycopy(input, 0, expected,0, input.length);
        Arrays.sort(expected);
        Task7.bubbleSort(input);
        Assertions.assertArrayEquals(expected, input);
    }
}