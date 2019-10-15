
# we have a number of bunnies and each bunny has two big floppy ears. We want to compute the total number of ears across all the bunnies recursively
def bunny_ears(bunnies):
    if bunnies == 0:
        return 0

    return 2 + bunny_ears(bunnies-1)

print(bunny_ears(0))
print(bunny_ears(1))
print(bunny_ears(2))
