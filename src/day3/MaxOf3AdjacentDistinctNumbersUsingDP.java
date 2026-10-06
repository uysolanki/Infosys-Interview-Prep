package day3;

public class MaxOf3AdjacentDistinctNumbersUsingDP {

	public static void main(String[] args) {
//		int arr[] = { 6,2,3,7,4 };
		int arr[] = { 6,9,9,7,4,3,3,2,1,9 };
		
		
		int max=maxOf3(arr);
		System.out.println(max);
	}

	private static int maxOf3(int[] arr) {
		int dp[]= new int[arr.length-2];
		int max=0;
		int sum=0;
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i]!=arr[i+1] && arr[i]!=arr[i+2] && arr[i+1]!=arr[i+2])
			dp[i]=arr[i]+arr[i+1]+arr[i+2];
			
					if(dp[i]>max)
						max=sum;
			
		}

		return max;
	}

}
