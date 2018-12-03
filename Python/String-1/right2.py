
#given a string, return a "rotated right 2" version where the last 2 chars are moved to the start
# the string length will be at least 2
def right2(str):
    s = ''

    if len(str) > 1:
        s = str[-2:] + str[:-2]

    return s

print(right2('Hello'))
print(right2('java'))
print(right2('Hi'))
