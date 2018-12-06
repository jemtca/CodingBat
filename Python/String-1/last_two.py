
# given a string of any length, return a new string where the last 2 chars, if present, are swapped
def last_two(str):
    s = ''

    if len(str) == 1:
        s = str
    elif len(str) >= 2:
        s = str[:-2] + str[len(str)-1] + str[len(str)-2] 

    return s

print(last_two('coding'))
print(last_two('cat'))
print(last_two('ab'))
