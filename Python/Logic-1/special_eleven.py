
# we'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of 11
# return true if the given non-negative number is special
def special_eleven(n):
    b = False

    if n >= 0:
        if n % 11 == 0 or n % 11 == 1:
            b = True

    return b

print(special_eleven(22))
print(special_eleven(23))
print(special_eleven(24))
