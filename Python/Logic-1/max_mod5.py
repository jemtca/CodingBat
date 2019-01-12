
#given two int values, return whichever value is larger
# however if the two values have the same remainder when divided by 5, then the return the smaller value
# however, in all cases, if the two values are the same, return 0
def max_mod5(a, b):
    max = 0

    if a % 5 == b % 5 and a == b:
        max = 0
    elif a % 5 == b % 5:
        if a < b:
            max = a
        else:
            max = b
    else:
        if a < b:
            max = b
        else:
            max = a    

    return max

print(max_mod5(2, 3))
print(max_mod5(6, 2))
print(max_mod5(3, 2))
