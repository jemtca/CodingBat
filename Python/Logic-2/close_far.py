
# given three ints, a b c, return true if one of b or c is "close" (differing from a by at most 1)
# while the other is "far", differing from both other values by 2 or more 
def close_far(a, b, c):
    bool = False

    if abs(b - a) < abs(c - a):
        close = b
        far = c
    else:
        close = c
        far = b

    if abs(close - a) < 2 and abs(far - close) > 1 and abs(far - a) > 1:
        bool = True

    return bool

print(close_far(1, 2, 10))
print(close_far(1, 2, 3))
print(close_far(4, 1, 3))
