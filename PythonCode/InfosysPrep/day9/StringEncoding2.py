s= "aaabbbcd"
s=s.strip().lower().replace(" ","");
result=""
dict={}
for i in range(0,len(s)):
    if s[i] in dict:
        dict[s[i]]+=1;
    else:
        dict[s[i]]=1;

for key,value in dict.items():
    result+=key+str(value)
print(result)