
# we have bunnies standing in a line, numbered 1, 2, ...
# the odd bunnies (1, 3, ..) have the normal 2 ears
# the even bunnies (2, 4, ..) we'll say have 3 ears, because they each have a raised foot
# return the number of "ears" in the bunny line 1, 2, ... n
def bunny_ears2(bunnies):
    if bunnies == 0:
        return 0
    if bunnies % 2 == 0:
        return 3 + bunny_ears2(bunnies-1)
    else:
        return 2 + bunny_ears2(bunnies-1)

print(bunny_ears2(0))
print(bunny_ears2(1))
print(bunny_ears2(2))
