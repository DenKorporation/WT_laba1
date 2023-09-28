package by.bsuir.main;

public class Task3 {

    public static void main(String[] args) {
        double[][] table = calculate(0, 1, 0.2);
        for (double[] row : table) {
            System.out.format("| %.4f | %.4f |\n", row[0], row[1]);
        }
    }

    public static double[][] calculate(double a, double b, double h) {
        int size = (int) Math.abs((b - a) / h) + 1;
        double[][] result = new double[size][2];
        double current = a;
        for (int i = 0; i < size; i++, current += h) {
            result[i][0] = current;
            result[i][1] = Math.tan(current);
        }

        return result;
    }
}
