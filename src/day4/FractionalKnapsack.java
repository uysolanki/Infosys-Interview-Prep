package day4;



import java.util.Arrays;
import java.util.Comparator;

public class FractionalKnapsack {

    public static double maxValue(
        int[] val, int[] wt, int capacity) {

        int n = val.length;

        // Store value, weight and value/weight ratio
        double[][] items = new double[n][3];

        for (int i = 0; i < n; i++) {
            items[i][0] = val[i];
            items[i][1] = wt[i];
            items[i][2] = (double) val[i] / wt[i];
        }

        // Sort by ratio in descending order
        Comparator<double[]> comparator =
        	    Comparator.comparingDouble(item -> item[2]);

        Arrays.sort(items, comparator.reversed());

        double totalValue = 0.0;

        for (int i = 0; i < n; i++) {

            double value = items[i][0];
            double weight = items[i][1];

            // Take the entire item if it fits
            if (weight <= capacity) {
                totalValue += value;
                capacity -= (int) weight;
            } else {
                // Take only the fraction that fits
                totalValue += value
                        * ((double) capacity / weight);
                break;
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {

        int[] val = {60, 100, 120};
        int[] wt = {10, 20, 30};
        int capacity = 50;

        System.out.printf("%.6f",
            maxValue(val, wt, capacity));
    }
}



