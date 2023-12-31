package by.bsuir.main;

import static java.lang.Math.*;

public class Task1 {
    public static double calculate(double x, double y) {
        double numerator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs(x - (2 * x) / (1 + pow(x * y, 2)));
        return  numerator / denominator + x;
    }
}
