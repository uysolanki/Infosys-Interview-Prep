package day3;

public class MaxOf3AdjacentDistinctNumbers {

	public static void main(String[] args) {
//		int arr[] = { 6,2,3,7,4 };
		int arr[] = { 6,9,9,7,4,3,3,2,1,9 };
		
		int max=maxOf2(arr);
		System.out.println(max);
	}

	private static int maxOf2(int[] arr) {
		int max=0;
		int sum=0;
		for(int i=0;i<arr.length-2;i++)
		{
			if(arr[i]!=arr[i+1] && arr[i]!=arr[i+2] && arr[i+1]!=arr[i+2])
			sum=arr[i]+arr[i+1]+arr[i+2];
			
					if(sum>max)
						max=sum;
			
		}

		return max;
	}

}
