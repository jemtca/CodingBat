
# we are having a party with amounts of tea and candy
# return the int outcome of the party encoded as 0=bad, 1=good, or 2=great
# a party is good (1) if both tea and candy are at least 5
# however, if either tea or candy is at least double the amount of the other one, the party is great (2)
# however, in all cases, if either tea or candy is less than 5, the party is always bad (0)
def tea_party(tea, candy):
    x = 0

    if tea >= 5 and candy >= 5:
        x = 1
    if tea >= candy * 2 or candy >= tea * 2:
        x = 2
    if tea < 5 or candy < 5:
        x = 0

    return x

print(tea_party(6, 8))
print(tea_party(3, 8))
print(tea_party(20, 6))
