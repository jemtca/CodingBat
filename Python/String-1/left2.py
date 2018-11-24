
# given a string, return a "rotated left 2" version where the first 2 chars are moved to the end
# the string length will be at least 2
def left2(str):
    s = ''

    if len(str) > 1:
        s = str[2:] + str[0:2]

    return s

print(left2('Hello'))
print(left2('java'))
print(left2('Hi'))
