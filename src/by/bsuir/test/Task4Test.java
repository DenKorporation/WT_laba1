package by.bsuir.test;

import by.bsuir.main.Task4;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Task4Test {

    @Test
    void General() {
        int[] input = {7, 2, 5, 6, 1, 0, -3, 13};
        int[] expected = {0, 1, 2, 7};
        Assertions.assertArrayEquals(expected, Task4.FindPrime(input));
    }

    @Test
    void EmptyResult() {
        int[] input = {12, 8, 6, 1, 0, -3};
        int[] expected = {};
        Assertions.assertArrayEquals(expected, Task4.FindPrime(input));
    }

    @Test
    void PrimeValue() {
        Assertions.assertTrue(Task4.IsPrime(7817));
    }

    @Test
    void CompositeValue() {
        Assertions.assertFalse(Task4.IsPrime(7818));
    }

    @Test
    void ZeroValue() {
        Assertions.assertFalse(Task4.IsPrime(0));
    }

    @Test
    void OneValue() {
        Assertions.assertFalse(Task4.IsPrime(1));
    }

    @Test
    void NegativeValue() {
        Assertions.assertFalse(Task4.IsPrime(-234));
    }
}