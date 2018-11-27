
# given a string, return a version without both the first and last char of the string
# the string may be any length, including 0
def without_end(str):
    s = ''

    if len(str) > 1:
        s = str[1:-1]

    return s

print(without_end('Hello'))
print(without_end('java'))
print(without_end('coding'))
