package day1;

import java.util.Scanner;

public class Prime6 {
public static void main(String[] args) {
	//Prime number which is divible by 1 & itself
	//input :7   output: prime  
	//input :8   output: not prime 
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter a number");
	int n=sc.nextInt();
	boolean result=	checkPrime(n);
	if(result==true)
		System.out.println("Prime");
	else
		System.out.println("Not Prime");
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
