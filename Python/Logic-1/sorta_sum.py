
# given 2 ints, a and b, return their sum
# however, sums in the range 10..19 inclusive, are forbidden, so in that case just return 20
def sorta_sum(a, b):
    sum = 0

    if a + b < 10 or a + b > 19:
        sum = a + b
    else:
        sum = 20

    return sum

print(sorta_sum(3, 4))
print(sorta_sum(9, 4))
print(sorta_sum(10, 11))
