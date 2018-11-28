
# given two strings, append them together (known as "concatenation") and return the result
# however, if the concatenation creates a double-char, then omit one of the chars
def con_cat(a, b):
    s = ''

    if a and not b:
        s = a
    if not a and b:
        s = b
    if a and b:
        if a[-1:] == b[0]:
            s = a[:-1] + b
        else:
            s = a + b

    return s

print(con_cat('abc', 'cat'))
print(con_cat('dog', 'cat'))
print(con_cat('abc', ''))
