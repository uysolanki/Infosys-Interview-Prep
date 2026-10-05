arr=[100,150,50,75,300]
#target=225
target=500

def checkSum(arr,target):
    for i in range(0,len(arr)):
        num1=arr[i]
        num2=target-num1
        for j in range(0,len(arr)):
            if arr[j]==num2:
                return [num1,num2]
    return None

result=checkSum(arr,target)
if result==None:
    print("No Matching pair found")
else:
    print(result)

