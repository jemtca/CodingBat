
# given a string and an index, return a string length 2 starting at the given index
# if the index is too big or too small to define a string length 2, use the first 2 chars
# the string length will be at least 2
def two_char(str, index):
    s = ''

    if len(str) > 1:
        if index < 0 or len(str) - index < 2:
            s = str[:2]
        else:
            s = str[index:index+2]

    return s

print(two_char('java', 0))
print(two_char('java', 2))
print(two_char('java', 3))
