package day4;

public class StairsClimbing {

	public static void main(String[] args) {
		int n=5;
		int ways=allPossibleWays(n);
		System.out.println(ways);

	}

	private static int allPossibleWays(int n) {
		int dp[]=new int[n+1];
		dp[1]=1;
		dp[2]=2;
		for(int i=3;i<=n;i++)
		{
			dp[i]=dp[i-2]+dp[i-1];
		}
		
		return dp[dp.length-1];
	}

}
