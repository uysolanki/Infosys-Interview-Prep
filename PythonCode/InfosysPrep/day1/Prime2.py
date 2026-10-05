n=int(input("Please enter a number"))
print(n)
flag=0
loopCounter=0
for i in range(2, n):
    loopCounter+=1
    if n%i==0:
        flag=1
        break
if flag==0:
    print("Prime")
else:
    print("Prime")

print(f"Iteration Count {loopCounter}")
