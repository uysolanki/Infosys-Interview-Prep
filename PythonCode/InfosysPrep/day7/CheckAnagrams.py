# s1="listen"
# s2="silent"

s1="apple"
s2="mango"
def checkAnagrams(s1,s2):
    return sorted(s1)==sorted(s2)

print("Anagram" if checkAnagrams(s1, s2) else "Not Anagram")

checkAnagrams("silent","listen")