s= "aaabbbcd"
s=s.strip().lower().replace(" ","");
result=""
count=1
for i in range(0,len(s)):
    if(i<len(s)-1 and s[i]==s[i+1]):
        count+=1
    else:
        result=result+ s[i]+ str(count);        # ""+a+3
        count=1
print(result)