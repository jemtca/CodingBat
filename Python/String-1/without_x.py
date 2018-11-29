
# given a string, if the first or last chars are 'x', return the string without those 'x' chars
# otherwise return the string unchanged
def without_x(str):
    s = ''

    if len(str) > 0:
        if len(str) > 1 and str[0] == 'x' and str[len(str)-1] == 'x':
            s = str[1:-1]
        elif str[0] == 'x':
            s = str[1:]
        elif str[len(str)-1] == 'x':
            s = str[:-1]
        else:
            s = str

    return s

print(without_x('xHix'))
print(without_x('xHi'))
print(without_x('Hxix'))
