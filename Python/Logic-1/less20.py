
# return true if the given non-negative number is 1 or 2 less than a multiple of 20
# so for example 38 and 39 return true, but 40 returns false
def less20(n):
    b = False

    if n >= 0:
        if n % 20 == 18 or n % 20 == 19:
            b = True

    return b

print(less20(18))
print(less20(19))
print(less20(20))
