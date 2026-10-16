import re
#virat$Kohli#anushka Sharma        //words="viratKohlianushkaSharma"
def convertToCamelCase(s):
    result=""
    words=re.findall(r'[a-zA-Z]+',s)
    print(words)
    if not words:
        return ""
    return words[0].lower()+"".join(w.capitalize() for w in words[1:])

# s="BOB loves-coding"
s="#virat$Kohli#anushka Sharma"
ans=convertToCamelCase(s)
print(ans)