
# for this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit is 5 or more, so 15 rounds up to 20
# alternately, round down to the previous multiple of 10 if its rightmost digit is less than 5, so 12 rounds down to 10
# given 3 ints, a b c, return the sum of their rounded values
def round_sum(a, b, c):
    return round10(a) + round10(b) + round10(c)

def round10(num):
    x = 0

    if num % 10 < 5:
        x = num - (num % 10)
    else:
        x = num + (10 - (num % 10))

    return x

print(round_sum(16, 17, 18))
print(round_sum(12, 13, 14))
print(round_sum(6, 4, 4))
