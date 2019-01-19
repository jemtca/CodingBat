
# given two ints, each in the range 10..99
# return true if there is a digit that appears in both numbers, such as the 2 in 12 and 23
def share_digit(a, b):
    bool = False

    if (a >= 10 and a <= 99) and (b >= 10 and b <= 99):
        if (int(a/10) == int(b/10) or int(a/10) == b%10) or (a%10 == int(b/10) or a % 10 == b % 10):
            bool = True

    return bool

print(share_digit(12, 23))
print(share_digit(12, 43))
print(share_digit(12, 44))
