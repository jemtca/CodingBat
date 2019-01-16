
# given a number n, return true if n is in the range 1..10, inclusive
# unless outsideMode is true, in which case return true if the number is less or equal to 1, or greater or equal to 10
def in1_to10(n, outside_mode):
    b = False

    if (n > 0 and n < 11 and not outside_mode) or (outside_mode and (n <= 1 or n >= 10)):
        b = True

    return b

print(in1_to10(5, False))
print(in1_to10(11, False))
print(in1_to10(11, True))
