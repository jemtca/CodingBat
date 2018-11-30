
# given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the outside and the longer string on the inside
# the strings will not be the same length, but they may be empty
def combo_string(a, b):
    s = ''

    if not a:
        s = b
    elif not b:
        s = a
    else:
        if len(a) < len(b):
            s = a + b + a
        else:
            s = b + a + b

    return s

print(combo_string('Hello' , 'hi'))
print(combo_string('hi', 'Hello'))
print(combo_string('aaa', 'b'))
