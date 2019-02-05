
# return a version of the given string, where for every star (*) in the string the star and the chars immediately to its left and right are gone
# so "ab*cd" yields "ad" and "ab**cd" also yields "ad"
def start_out(str):
    s = ''

    for x in range(len(str)):
        if x == 0 and str[x] != '*':
            s = s + str[x]
        if x > 0 and str[x] != '*' and str[x-1] != '*':
            s = s + str[x]
        if x > 0 and str[x] == '*' and str[x-1] != '*':
            s = s[:len(s)-1]
    
    return s

print(start_out('ab*cd'))
print(start_out('ab**cd'))
print(start_out('sm*eilly'))
