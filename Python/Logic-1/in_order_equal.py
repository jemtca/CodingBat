
# given three ints, a b c, return true if they are in strict increasing order, such as 2 5 11, or 5 6 7, but not 6 5 7 or 5 5 7
# however, with the exception that if "equalOk" is true, equality is allowed, such as 5 5 7 or 5 5 5
def in_order_equal(a, b, c, equal_ok):
    bool = False

    if not equal_ok:
        if c > b and b > a:
            bool = True
    else:
        if c >= b and b >= a:
            bool = True 

    return bool

print(in_order_equal(2, 5, 11, False))
print(in_order_equal(5, 7, 6, False))
print(in_order_equal(5, 5, 7, True))
