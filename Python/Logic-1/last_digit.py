
# given three ints, a b c, return true if two or more of them have the same rightmost digit
# the ints are non-negative
def last_digit(a, b, c):
    bool = False

    if a >= 0 and b >= 0 and c >= 0:
        if a % 10 == b % 10 or b % 10 == c % 10 or a % 10 == c % 10:
            bool = True

    return bool

print(last_digit(23, 19, 13))
print(last_digit(23, 19, 12))
print(last_digit(23, 19 , 3))
