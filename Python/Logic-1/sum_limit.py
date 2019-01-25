
# given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a
# if the sum has more digits than a, just return a without b
def sum_limit(a, b):
    x = a + b

    sum = str(x)
    s1 = str(a)

    if len(sum) > len(s1):
        x = a

    return x

print(sum_limit(2, 3))
print(sum_limit(8, 3))
print(sum_limit(8, 1))
