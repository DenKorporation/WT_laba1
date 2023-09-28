package by.bsuir.main;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.*;

public class Task4 {
    public static boolean IsPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int[] FindPrime(int[] arr) {
        ArrayList<Integer> indexes = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (IsPrime(arr[i])) indexes.add(i);
        }

        int[] result = new int[indexes.size()];
        for (int i = 0; i < indexes.size(); i++) {
            result[i] = indexes.get(i).intValue();
        }

        return result;
    }
}
