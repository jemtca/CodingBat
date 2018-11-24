
# given a string, return a version without the first and last char
# the string length will be at least 2
def without_end(str):
    s = ''

    if len(str) > 1:
        s = str[1:-1]

    return s

print(without_end('Hello'))
print(without_end('java'))
print(without_end('coding'))
