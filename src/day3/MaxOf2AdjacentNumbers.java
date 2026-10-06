package day3;

public class MaxOf2AdjacentNumbers {

	public static void main(String[] args) {
//		int arr[] = { 6,2,3,7,4 };
		int arr[] = { 6,2,8,7,4 };
		
		int max=0;
		
		for(int i=0;i<arr.length-1;i++)
		{
			int sum=arr[i]+arr[i+1];
					if(sum>max)
						max=sum;
			
		}

		System.out.println(max);
	}

}
