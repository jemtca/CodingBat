
# given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive, are extra lucky
# so if either value is a teen, just return 19
def teen_sum(a, b):
    sum = 0

    if a >= 13 and a <= 19 or b >= 13 and b <= 19:
        sum = 19
    else:
        sum = a + b

    return sum

print(teen_sum(3, 4))
print(teen_sum(10, 13))
print(teen_sum(13, 2))
