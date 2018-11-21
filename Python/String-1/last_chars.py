
# given 2 strings, a and b, return a new string made of the first char of a and the last char of b
# if either string is length 0, use '@' for its missing char
def last_chars(a, b):
    s = ''

    if not a and not b:
        s = '@@'
    elif not a:
        s = '@' + b[len(b)-1:]
    elif not b:
        s = a[0] + '@'
    else:
        s = a[0] + b[len(b)-1:]

    return s

print(last_chars('last', 'chars'))
print(last_chars('yo', 'java'))
print(last_chars('hi', ''))
