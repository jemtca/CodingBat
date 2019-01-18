
# given three ints, a b c, return true if b is greater than a, and c is greater than b
# however, with the exception that if "bOk" is true, b does not need to be greater than a
def in_order(a, b, c, b_ok):
    bool = False

    if (not b_ok and b > a and c > b) or (b_ok and c > b):
        bool = True

    return bool

print(in_order(1, 2, 4, False))
print(in_order(1, 2, 1, False))
print(in_order(1, 1, 2, True))
