
# you have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2
# if they are all the value 2, the result is 10
# otherwise if they are all the same, the result is 5
# otherwise so long as both b and c are different from a, the result is 1
# otherwise the result is 0
def red_ticket(a, b, c):
    x = 0

    if a == 2 and b == 2 and c == 2:
        x = 10
    elif (a == 0 and b == 0 and c == 0) or (a == 1 and b == 1 and c == 1):
        x = 5
    elif b != a and c != a:
        x = 1

    return x

print(red_ticket(2, 2, 2))
print(red_ticket(2, 2, 1))
print(red_ticket(0, 0, 0))
