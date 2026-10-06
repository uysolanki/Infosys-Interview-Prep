package day3;

public class MaxOf3AdjacentNumbers2 {

	public static void main(String[] args) {
//		int arr[] = { 6,2,3,7,4 };
		int arr[] = { 6,9,9,7,4 };
		
		int max=maxOf2(arr);
		System.out.println(max);
	}

	private static int maxOf2(int[] arr) {
		int max=0;
		
		for(int i=0;i<arr.length-2;i++)
		{
			int sum=arr[i]+arr[i+1]+arr[i+2];
					if(sum>max)
						max=sum;
			
		}

		return max;
	}

}
