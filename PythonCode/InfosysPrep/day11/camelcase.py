
def convertToCamelCase(s):
    result=""
    nextCapital=False
    for i in s:
        if i.isalpha():
            if len(result)==0:
                result+=i.lower()
            elif nextCapital:
                result+=i.upper()
                nextCapital=False
            else:
                result+=i.lower()
        else:
            nextCapital=True
    return result

s="BOB loves-coding"
ans=convertToCamelCase(s)
print(ans)