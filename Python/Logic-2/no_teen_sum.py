
# given 3 int values, a b c, return their sum
# however, if any of the values is a teen -- in the range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a teens
def no_teen_sum(a, b, c):
    sum = a + b + c

    if fix_teen(a) == 0 and fix_teen(b) == 0 and fix_teen(c) == 0:
        sum = 0
    elif fix_teen(a) != 0 and fix_teen(b) == 0 and fix_teen(c) == 0:
        sum = a
    elif fix_teen(a) != 0 and fix_teen(b) != 0 and fix_teen(c) == 0:
        sum = a + b
    elif fix_teen(a) == 0 and fix_teen(b) != 0 and fix_teen(c) == 0:
        sum = b
    elif fix_teen(a) == 0 and fix_teen(b) != 0 and fix_teen(c) != 0:
        sum = b + c
    elif fix_teen(a) == 0 and fix_teen(b) == 0 and fix_teen(c) != 0:
        sum = c
    elif fix_teen(a) != 0 and fix_teen(b) == 0 and fix_teen(c) != 0:
        sum = a + c

    return sum

# helper
def fix_teen(n):
    if n == 13 or n == 14 or n == 17 or n == 18 or n == 19:
        n = 0

    return n

print(no_teen_sum(1, 2, 3))
print(no_teen_sum(2, 13, 1))
print(no_teen_sum(2, 1, 14))
