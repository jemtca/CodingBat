
# return true if the given non-negative number is 1 or 2 more than a multiple of 20
def more20(n):
    b = False

    if n % 20 == 1 or n % 20 == 2:
        b = True 

    return b

print(more20(20))
print(more20(21))
print(more20(22))
