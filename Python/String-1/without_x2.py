
# given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars
# otherwise return the string unchanged
def without_x2(str):
    s = ''

    if len(str) == 1:
        if str[0] != 'x':
            s = str
    elif len(str) > 1:
        if str[0] == 'x' and str[1] != 'x':
            s = str[1:]
        elif str[0] != 'x' and str[1] == 'x':
            s = str[0] + str[2:]
        elif str[0] == 'x' and str[1] == 'x':
            s = str[2:]
        else:
            s = str

    return s

print(without_x2('xHi'))
print(without_x2('Hxi'))
print(without_x2('Hi'))
