package by.bsuir.main;

public class Task6 {
    public static double[][] transform(double[] arr)
    {
        double[][] result = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
                result[i][j] = arr[(i + j) % arr.length];
            }
        }

        return result;
    }
}
