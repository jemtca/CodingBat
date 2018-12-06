
# given two strings, append them together (known as "concatenation") and return the result
# however, if the strings are different lengths, omit chars from the longer string so it is the same length as the shorter string
# so "Hello" and "Hi" yield "loHi"
# the strings may be any length
def min_cat(a, b):
    s = ''

    if len(a) == len(b):
        s = a + b
    elif len(a) > len(b):
        s = a[len(a)-len(b):] + b
    elif len(b) > len(a):
        s = a + b[len(b)-len(a):]

    return s

print(min_cat('Hello', 'hi'))
print(min_cat('Hello', 'java'))
print(min_cat('java', 'Hello'))
