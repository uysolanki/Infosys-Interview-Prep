n=int(input("Please enter a number"))
print(n)
counter=0
loopCounter=0
for i in range(1, n+1):
    loopCounter+=1
    if n%i==0:
        counter+=1
if counter==2:
    print("Prime")
else:
    print("Prime")

print(f"Iteration Count {loopCounter}")
