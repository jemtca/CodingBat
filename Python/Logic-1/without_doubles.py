
# return the sum of two 6-sided dice rolls, each in the range 1..6
# however, if noDoubles is true, if the two dice show the same value, increment one die to the next value, wrapping around to 1 if its value was 6
def without_doubles(die1, die2, no_doubles):
    sum = 0

    if not no_doubles or die1 != die2:
        sum = die1 + die2
    else:
        if die1 >= 1 and die1 <= 5:
            die1 += 1
            sum = die1 + die2
        else:
            die1 = 1
            sum = die1 + die2

    return sum

print(without_doubles(2, 3, True))
print(without_doubles(3, 3, True))
print(without_doubles(3, 3, False))
