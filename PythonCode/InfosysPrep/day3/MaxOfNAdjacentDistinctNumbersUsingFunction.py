# numbers=[6,2,3,7,4]
numbers=[9,9,8,7,7]
n=3

def maxWindow(numbers,n):
    max=0
    for i in range(0,len(numbers)-(n-1)):
        if(numbers[i]!=numbers[i+1] and numbers[i]!=numbers[i+2] and numbers[i+1]!=numbers[i+2]):
            sum=numbers[i]+numbers[i+1]+numbers[i+2]
            if(sum>max):
                max=sum
    print(max)

maxWindow(numbers,n)