# numbers=[6,2,3,7,4]
numbers=[9,9,8,8,4]
max=0
for i in range(0,len(numbers)-2):
    sum=numbers[i]+numbers[i+1]+numbers[i+2]
    if(sum>max):
        max=sum

print(max)