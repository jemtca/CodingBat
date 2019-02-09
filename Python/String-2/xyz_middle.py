
# given a string, does "xyz" appear in the middle of the string?
# to define middle, we'll say that the number of chars to the left and right of the "xyz" must differ by at most one
# this problem is harder than it looks
def xyz_middle(str):
    b = False
    middle = 0

    if len(str) > 2:
        if len(str) % 2 != 0:
            middle = int(len(str)/2)
            if str[middle] == 'y' and str[middle-1] == 'x' and str[middle+1] == 'z':
                b = True
        else:
            middle = int(len(str)/2) -1
            if (str[middle] == 'y' and str[middle-1] == 'x' and str[middle+1] == 'z') or (str[middle+1] == 'y' and str[middle] == 'x' and str[middle+2] == 'z'):
                b = True

    return b

print(xyz_middle('AAxyzBB'))
print(xyz_middle('AxyzBB'))
print(xyz_middle('AxyzBBB'))
