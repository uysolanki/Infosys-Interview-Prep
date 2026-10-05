package day2;

import java.util.Arrays;
import java.util.List;

public class SumOfTwo4 {

	public static void main(String[] args) {
		int arr[]= {100,150,50,75,300};
		int target=500;
//		int target=225;
		int result[]=checkSum(arr,target);
		if(result==null)
			System.out.println("No Matching Pairs Found");
		else
			System.out.println(Arrays.toString(result));
	}

	private static int[] checkSum(int[] arr, int target) {

		List<Integer> arr1=Arrays.stream(arr)
                .boxed()
                .toList();
		
		System.out.println(arr1);
		for(int i=0;i<arr1.size();i++)			
		{										
			int num1=arr1.get(i);					
			int num2=target-num1;											
											
				if(arr1.contains(num2))				
				{		
					return new int[] {num1,num2};  //[100,125]					
				}
		}
		return null;
	}
				
}
