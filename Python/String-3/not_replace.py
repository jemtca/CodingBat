
# given a string, return a string where every appearance of the lowercase word "is" has been replaced with "is not"
# the word "is" should not be immediately preceeded or followed by a letter -- so for example the "is" in "this" does not count 
def not_replace(str):
    s = ''
    x = 0

    while(x < len(str)):
        if x-1 >= 0 and str[x-1].isalpha() or x+2 < len(str) and str[x+2].isalpha():
            s = s + str[x]
        elif x+1 < len(str) and str[x:x+2] == 'is':
            s = s + 'is not'
            x += 1
        else:
            s = s + str[x]
        x += 1

    return s

print(not_replace('is test'))
print(not_replace('is-is'))
print(not_replace('This is right'))
