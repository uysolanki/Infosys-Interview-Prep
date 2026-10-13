package day6;

public class ChessRobotTravelStartToEnd {

	public static void main(String[] args) {
		//int r=3,c=2;     //ans =3
		int r=4,c=3;   //ans =10
		int paths=playGame(r,c);
		System.out.println("Number of paths "+paths);
	}

	private static int playGame(int r, int c) {
		int dp[][]=new int[r][c];
		
		//fill 1st row with 1's
		for(int i=0;i<c;i++)
			dp[0][i]=1;
		
		//fill 1st column with 1's
		for(int i=0;i<r;i++)
			dp[i][0]=1;
		
		for(int i=1;i<r;i++)
		{
			for(int j=1;j<c;j++)
			{
				dp[i][j]= dp[i][j-1] + dp[i-1][j];
			}
		}
		
		return dp[r-1][c-1];
		
	}

}
