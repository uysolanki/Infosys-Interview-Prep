package day1;

import java.util.Scanner;

public class Prime9 {
public static void main(String[] args) {
	//Prime number which is divible by 1 & itself
	//input :7   output: prime  
	//input :8   output: not prime 
	//karnex software
	//depends on interview
	System.out.println("List of Prime Numbers");
	int arr[]= {18,17,43,12,97};
	for(int i = 0;i<arr.length;i++)
		if(checkPrime(arr[i]))
				System.out.println(arr[i]);
	
}

private static boolean checkPrime(int n) {
	int counter=0;
	int flag=0;
	for(int i=2;i<=Math.sqrt(n);i++)
	{
		if(n%i==0)
		{
			flag=1;
			break;
		}	
	}
	return flag==0;
}
}
