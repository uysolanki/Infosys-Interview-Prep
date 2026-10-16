s="abcabcdweaby"

def findSubString(s):
    left=0
    max1=0
    hashset=set()
    for right in range(0,len(s)):
        while(s[right] in hashset):
            hashset.remove(s[left])
            left+=1
        hashset.add(s[right])
        max1=max(max1, (right-left)+1)
    return max1


len=findSubString(s)
print(len)