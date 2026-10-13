
# temps = [73, 74, 75, 71, 69, 72, 76, 73]
# temps = [30,40,50,60]
temps = [30, 60, 90]
dp = [0] * len(temps)

for i in range(len(temps) - 1):
    days = 1

    for j in range(i + 1, len(temps)):
        if temps[j] > temps[i]:
            dp[i] = days
            break
        else:
            days += 1

print(dp)
