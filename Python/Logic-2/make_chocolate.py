
# we want make a package of goal kilos of chocolate
# we have small bars (1 kilo each) and big bars (5 kilos each)
# return the number of small bars to use, assuming we always use big bars before small bars. Return -1 if it can't be done
def make_chocolate(small, big, goal):
    x = -1
    how_many_big_ones = (int)(goal / 5)

    if goal <= small + (big * 5):
        if goal == big * 5:
            x = 0
        elif goal < big * 5 and small >= goal - (how_many_big_ones * 5):
            x = goal - (how_many_big_ones * 5)
        elif goal > big * 5 and small >= goal - (big * 5):
            x = goal - (big * 5)
 
    return x

print(make_chocolate(4, 1, 9))
print(make_chocolate(4, 1, 10))
print(make_chocolate(4, 1, 7))
