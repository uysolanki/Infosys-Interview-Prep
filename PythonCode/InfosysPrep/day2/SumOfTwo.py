arr=[100,150,50,75,300]
target=225

for i in range(0,len(arr)):
    num1=arr[i]
    num2=target-num1
    flag=0
    for j in range(0,len(arr)):
        if arr[j]==num2:
            flag=1
            print(f"[{num1},{num2}]")
            break
    if flag==1:
        break