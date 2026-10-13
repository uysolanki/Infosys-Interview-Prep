#r=3;c=2
r=4;c=3

def playGame(r,c):
    dp = [[0] * c for _ in range(r)]# 2D array declared
    for i in range(0,c):
        dp[0][i]=1
    for i in range(0,r):
            dp[i][0]=1
    for i in range(1,r):
         for j in range(1,c):
              dp[i][j]=dp[i][j-1]+dp[i-1][j]
    return dp[r-1][c-1]

paths=playGame(r,c)
print(f"Number of paths {paths}")