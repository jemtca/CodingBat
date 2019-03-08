
# given a string, return true if the number of appearances of "is" anywhere in the string is equal to the number of appearances of "not" anywhere in the string (case sensitive)
def equal_is_not(str):
    b = False
    is_times = 0
    not_times = 0

    for x in range(len(str)-1):
        if str[x] == 'i' and str[x+1] == 's':
            is_times += 1
    
    for x in range(len(str)-2):
        if str[x] == 'n' and str[x+1] == 'o' and str[x+2] == 't':
            not_times += 1
    
    if is_times == not_times:
        b = True

    return b

print(equal_is_not('This is not'))
print(equal_is_not('This is notnot'))
print(equal_is_not('noisxxnotyynotxisi'))
