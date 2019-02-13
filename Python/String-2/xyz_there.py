
# return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.)
# so "xxyz" counts but "x.xyz" does not
def xyz_there(str):
    b = False

    for x in range(len(str)-2):
        if x == 0 and str[x] == 'x' and str[x:x+3] == 'xyz':
            b = True
        elif x > 0 and str[x-1] != '.' and str[x] == 'x' and str[x:x+3] == 'xyz':
            b = True

    return b

print(xyz_there('abcxyz'))
print(xyz_there('abc.xyz'))
print(xyz_there('xyz.abc'))
