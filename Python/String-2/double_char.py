
# given a string, return a string where for every char in the original, there are two chars
def double_char(str):
    s = ''

    for x in range(len(str)):
        s = s + str[x] + str[x]

    return s

print(double_char('The'))
print(double_char('AABB'))
print(double_char('Hi-There'))
