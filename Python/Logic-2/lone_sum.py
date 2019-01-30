
# given 3 int values, a b c, return their sum
# however, if one of the values is the same as another of the values, it does not count towards the sum
def lone_sum(a, b, c):
    sum = a + b + c

    if a == b and a == c:
        sum  = 0
    elif a == b:
        sum = c
    elif a == c:
        sum = b
    elif b == c:
        sum = a

    return sum

print(lone_sum(1, 2, 3))
print(lone_sum(3, 2, 3))
print(lone_sum(3, 3, 3))
