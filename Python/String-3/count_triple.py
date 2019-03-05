
# we'll say that a "triple" in a string is a char appearing three times in a row
# return the number of triples in the given string
# the triples may overlap
def count_triple(str):
    count = 0
    s = str.lower()
    
    for x in range(len(str)-2):
        if s[x] == s[x+1] and s[x] == s[x+2]:
            count += 1

    return count

print(count_triple('abcXXXabc'))
print(count_triple('xxxabyyyycd'))
print(count_triple('a'))
