package by.bsuir.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task8 {
    public static int[] findIndexes(int[] a, int[] b) {
        int[] indexes = new int[b.length];
        int i = 0, j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                i++;
            } else {
                indexes[j] = i;
                j++;
            }
        }

        while (j < b.length) {
            indexes[j] = i;
            j++;
        }

        return indexes;
    }
}
