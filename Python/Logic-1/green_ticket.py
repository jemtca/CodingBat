
# you have a green lottery ticket, with ints a, b, and c on it
# if the numbers are all different from each other, the result is 0
# if all of the numbers are the same, the result is 20
# if two of the numbers are the same, the result is 10
def green_ticket(a, b, c):
    x = 0

    if a == b and a == c and b == c:
        x = 20
    elif a == b or a == c or b == c:
        x = 10

    return x

print(green_ticket(1, 2, 3))
print(green_ticket(2, 2, 2))
print(green_ticket(1, 1, 2))
