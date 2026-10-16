package day4;

import java.util.Arrays;
import java.util.Comparator;

public class KingFunctions {

	public static void main(String[] args) {
		
		int start[] = {1, 3, 0, 5, 8, 5}, finish[] = {2, 4, 6, 7, 9, 9};
		int n = start.length;
		int[][] activities = new int[start.length][2];

		for (int i = 0; i < start.length; i++) {
		    activities[i][0] = start[i];
		    activities[i][1] = finish[i];
		}

		Comparator<int[]> comparator =
        	    Comparator.comparingInt(arr -> arr[1]);
		
		Arrays.sort(activities,comparator);
		
		int count = 1;

        // Finish time of the first selected activity
        int lastFinish = activities[0][1];

        for (int i = 1; i < n; i++) {

            // Select if the activity does not overlap
            if (activities[i][0] >= lastFinish) {

                count++;
                lastFinish = activities[i][1];
            }
        }

        System.out.println(count);
	}

}
