arr=[100,150,50,75,300]
# target=225
target=500

def checkSum(arr,target):
    for i in range(0,len(arr)):
        num1=arr[i]
        num2=target-num1
        if num2 in arr:
                return [num1,num2]
    return None

result=checkSum(arr,target)
if result==None:
    print("No Matching pair found")
else:
    print(result)

