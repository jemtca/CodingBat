
# you have a blue lottery ticket, with ints a, b, and c on it
# this makes three pairs, which we'll call ab, bc, and ac
# consider the sum of the numbers in each pair
# if any pair sums to exactly 10, the result is 10
# otherwise if the ab sum is exactly 10 more than either bc or ac sums, the result is 5
# otherwise the result is 0
def blue_ticket(a, b, c):
    max = 0

    if a + b == 10 or b + c == 10 or a + c == 10:
        max = 10
    elif a + b == b + c + 10 or a + b == a + c + 10:
        max = 5

    return max

print(blue_ticket(9, 1, 0))
print(blue_ticket(9, 2, 0))
print(blue_ticket(6, 1, 4))
