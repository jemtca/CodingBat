
# we'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to its left or right
# return true if all the g's in the given string are happy
def g_happy(str):
    b = True

    for x in range(len(str)):
        if str[x] == 'g':
            if x > 0 and str[x-1] == 'g':
                b = True
            elif x < len(str)-1 and str[x+1] == 'g': 
                b = True
            else:
                b = False

    return b

print(g_happy('xxggxx'))
print(g_happy('xxgxx'))
print(g_happy('xxggyygxx'))
