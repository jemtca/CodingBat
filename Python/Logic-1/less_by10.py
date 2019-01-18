
# given three ints, a b c, return true if one of them is 10 or more less than one of the others
def less_by10(a, b, c):
    bool = False

    if abs(a - b) >= 10 or abs(a - c) >= 10 or abs(b - c) >= 10:
        bool = True

    return bool

print(less_by10(1, 7, 11))
print(less_by10(1, 7, 10))
print(less_by10(11, 1, 7))
