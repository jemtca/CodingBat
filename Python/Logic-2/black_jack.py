
# given 2 int values greater than 0, return whichever value is nearest to 21 without going over
# return 0 if they both go over
def blackjack(a, b):
    x = 0

    if a > 0 and b > 0:
        if a <= 21 and b <= 21:
            x = max(a, b)
        elif a <= 21 and b > 21:
            x = a
        elif a > 21 and b <= 21:
            x = b

    return x

print(blackjack(19, 21))
print(blackjack(21, 19))
print(blackjack(19, 22))
