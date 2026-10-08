package day4;

import java.util.Arrays;

public class MaxSumMinCoins {

	public static void main(String[] args) {
		int coins[]= {2, 17, 7, 3};
		int min=minCoins(coins);
		System.out.println(min);
	}
	
	
	public static int minCoins(int[] arr) {

        int totalSum = 0;

        // Calculate total sum
        for (int num : arr) {
            totalSum += num;
        }

        // Sort
        Arrays.sort(arr);

        int selectedSum = 0;
        int count = 0;

        // Pick largest coins first
        for (int i = arr.length - 1; i >= 0; i--) {

            selectedSum += arr[i];
            count++;

            int remainingSum = totalSum - selectedSum;

            if (selectedSum > remainingSum) {
                return count;
            }
        }

        return count;
    }
}

