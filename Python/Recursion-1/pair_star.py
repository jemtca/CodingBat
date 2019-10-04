
# given a string, compute recursively a new string where identical chars that are adjacent in the original string are separated from each other by a "*"
def pair_star(str):
    s = ''

    if not str:
        return s
    if len(str) > 1 and str[0] == str[1]:
        return s + str[0] + '*' + pair_star(str[1:])
    else:
        return s + str[0] + pair_star(str[1:])

    return 0

print(pair_star("hello"))
print(pair_star("xxyy"))
print(pair_star("aaaa"))
