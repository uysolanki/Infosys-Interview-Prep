# numbers=[6,2,3,7,4]
numbers=[6,2,8,7,4]
max=0
for i in range(0,len(numbers)-1):
    sum=numbers[i]+numbers[i+1]
    if(sum>max):
        max=sum

print(max)