package day4;

public class MaxLoot {
													//		     i	
	public static void main(String[] args) {		//0	  1  2   3
		int houses[]= {4,5,8,3,1};					//4   5  8   3
		int max=calculateMaxLoot(houses);
		System.out.println(max);
	}

	private static int calculateMaxLoot(int[] houses) {
		int dp[]=new int[houses.length+1];
														//1		2    3     4    5
		dp[1]= houses[0];								//4		5    12    12   13
		dp[2]= Math.max(houses[0], houses[1]);
		
		for(int i=2;i<houses.length;i++)
		{
			int take = houses[i]+ dp[i-1];  //8
			int leave = dp[i];              //12
			dp[i+1]=Math.max(take, leave);
		}
		
		return dp[dp.length-1];
	}

}
