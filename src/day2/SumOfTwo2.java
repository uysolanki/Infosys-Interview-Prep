package day2;

import java.util.Arrays;

public class SumOfTwo2 {

	public static void main(String[] args) {
		int arr[]= {100,150,50,75,300};
//		int target=500;
		int target=225;
		int result[]=checkSum(arr,target);
		if(result==null)
			System.out.println("No Matching Pairs Found");
		else
			System.out.println(Arrays.toString(result));
	}

	private static int[] checkSum(int[] arr, int target) {

		for(int i=0;i<arr.length;i++)			
		{										
			int num1=arr[i];					
			int num2=target-num1;				
			int flag=0;							
			for(int j=0;j<arr.length;j++)		
			{									
				if(arr[j]==num2)				
				{		
					return new int[] {num1,num2};  //[100,125]					
				}
			}
		}
		return null;
	}
				
}
