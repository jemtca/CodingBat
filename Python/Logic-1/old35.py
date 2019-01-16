
# return true if the given non-negative number is a multiple of 3 or 5, but not both
def old35(n):
    b = False

    if n > 0:
        if n % 3 == 0 or n % 5 == 0:
            b = True
        if n % 3 == 0 and n % 5 == 0:
            b = False

    return b

print(old35(3))
print(old35(10))
print(old35(15))
