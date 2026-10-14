s= "aaabbbcd"
s=s.strip().lower().replace(" ","");
result=""
dict={}
for i in s:
    if i in dict:
        dict[i]+=1;
    else:
        dict[i]=1;

for key,value in dict.items():
    result+=key+str(value)
print(result)