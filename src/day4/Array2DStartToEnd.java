package day4;

public class Array2DStartToEnd {

	public static void main(String[] args) {
		int r=3;
		int c=7;
		int arr[][]=new int[r][c];
		int dp[][]=new int[r][c];
		
		//fill first row with 1's
		for(int i=0;i<c;i++)
			dp[0][i]=1;
		
		//fill first col with 1's
		for(int i=0;i<r;i++)
			dp[i][0]=1;
		
			
		for(int i=1;i<r;i++)						
			for(int j=1;j<c;j++)					
				dp[i][j] 	=	dp[i][j-1]	+	dp[i-1][j];

		System.out.println(dp[r-1][c-1]);

	}

}
