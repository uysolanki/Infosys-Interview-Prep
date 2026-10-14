package day8;

import java.util.Arrays;

public class WarmTemp {                         //                      j
												//                i
	public static void main(String[] args) {	// 0  1  2  3  4  5  6  7
		//int temps[]= {73,74,75,71,69,72,76,73};	//[73,74,75,71,69,72,76,73]
		int temps[]= {30,40,50,60};	
		//int temps[]= {30,60,90};	
	
		int dp[]=new int[temps.length];    		//[0, 0, 0, 0, 0, 0, 0, 0 ]
		int i,j;
		for(i=0;i<temps.length-2;i++)  //exp  [1, 1, 4, 2, 1, 1, 0, 0 ]   6<6 true
		{
			int days=1;
			for(j=i+1;j<temps.length;j++)//act[1, 1, 4,	2, 1, 1,		  5<8 true
			{
				if(temps[j]<temps[i])  //days=1,2			is 73<76 true
					days++;		
				else
					break;
			}
			dp[i]=days;
		}
		
		if(temps[i+1] > temps[i])
			dp[i]=1;
		
		System.out.println(Arrays.toString(dp));
	}

}
