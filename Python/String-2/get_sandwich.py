
# a sandwich is two pieces of bread with something in between
# return the string that is between the first and last appearance of "bread" in the given string, or return the empty string "" if there are not two pieces of bread
def get_sandwich(str):
    s = ''
    front = 0
    back = 0
    found = False
    bread = 0

    i = 0
    while (i < len(str)-4 and not found):
        if str[i:i+5] == 'bread':
            front = i+5
            found = True
        i+=1
    
    found = False
    i = len(str)
    while (i >= 5 and not found):
        if str[i-5:i] == 'bread':
            back = i-5
            found = True
        i-=1
    
    for x in range(len(str)-4):
        if str[x:x+5] == 'bread':
            bread+=1

    if bread > 1:
        s = s + str[front:back]

    return s

print(get_sandwich('breadjambread'))
print(get_sandwich('xxbreadjambreadyy'))
print(get_sandwich('xxbreadyy'))
