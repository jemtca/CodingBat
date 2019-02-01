
# given 3 int values, a b c, return their sum
# however, if one of the values is 13 then it does not count towards the sum and values to its right do not count
# so for example, if b is 13, then both b and c do not count
def lucky_sum(a, b, c):
    sum = a + b + c

    if a == 13:
        sum = 0
    elif b == 13:
        sum = a
    elif c == 13:
        sum = a + b

    return sum

print(lucky_sum(1, 2, 3))
print(lucky_sum(1, 2, 13))
print(lucky_sum(1, 13, 3))
