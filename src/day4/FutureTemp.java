package day4;

import java.util.Arrays;

public class FutureTemp {

	public static void main(String[] args) {
		//int arr[]= {73,74,75,71,69,72,76,73};
		//int arr[]= {30,40,50,60};
		int arr[]= {30,60,90};
		int dp[]=new int[arr.length];
		int i,j;
		for(i=0;i<arr.length-2;i++)
		{
			int counter=0;
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[i])
					counter++;
				else
					break;
			}
			dp[i]=counter+1;
		}
		if(arr[i+1]>arr[i])
			dp[i]=1;

		System.out.println(Arrays.toString(dp));
	}

}
