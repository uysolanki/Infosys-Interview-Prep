package day4;

public class MaxLoot2 {
													//               i		     	
	public static void main(String[] args) {		//0	  1  2   3   4
		int houses[]= {4,5,8,16,3};					//4   5  8   16  3
		int max=calculateMaxLoot(houses);
		System.out.println(max);
	}

	private static int calculateMaxLoot(int[] houses) {
		int dp[]=new int[houses.length];
														//0     1    2     3    4
		dp[0]= houses[0];								//4     5    12    21   21
		dp[1]= Math.max(houses[0], houses[1]);
		
		for(int i=2;i<houses.length;i++)
		{
			int take = houses[i]+ dp[i-2];  //28
			int leave = dp[i-1];            //12
			dp[i]=Math.max(take, leave);
		}
		
		return dp[dp.length-1];
	}

}
