houses=[4,5,8,3,1]


def calcMaxLoot(houses):
    dp=[]
    dp.append(houses[0])
    dp.append(max(houses[0],houses[1]))

    for i in range(2,len(houses)):
        take = houses[i] + dp[i-2]
        leave= dp[i-1]
        dp.append(max(take,leave))
    return dp[len(dp)-1]
    
max=calcMaxLoot(houses)
print(max)