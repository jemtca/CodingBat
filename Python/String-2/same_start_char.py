
# returns true if for every '*' (star) in the string, if there are chars both immediately before and after the star, they are the same
def same_start_char(str):
    b = True

    for x in range(1,len(str) - 1):
        if str[x] == '*' and str[x-1] != str[x+1]:
            b = False

    return b

print(same_start_char('xy*yzz'))
print(same_start_char('xy*zzz'))
print(same_start_char('*xa*az'))
