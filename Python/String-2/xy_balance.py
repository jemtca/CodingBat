
# we'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a 'y' char somewhere later in the string
# so "xxy" is balanced, but "xyx" is not. One 'y' can balance multiple 'x's
# return true if the given string is xy-balanced
def xy_balance(str):
    b = True
    y_pos = 0
    i = len(str) - 1
    found = False

    while (i >= 0 and not found):
        if str[i] == 'y':
            y_pos = i
            found = True
        i -= 1
    
    if 'x' in str[y_pos:]:
        b = False

    return b

print(xy_balance('aaxbby'))
print(xy_balance('aaxbb'))
print(xy_balance('yaaxbb'))
