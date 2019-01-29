
# we want to make a row of bricks that is goal inches long
# we have a number of small bricks (1 inch each) and big bricks (5 inches each)
# return true if it is possible to make the goal by choosing from the given bricks
def make_bricks(small, big, goal):
    b = False
    how_many_big_ones = round((big * 5) / goal)

    if big * 5 == goal:
        b = True
    elif big * 5 < goal and small + big * 5 >= goal:
        b = True
    elif big * 5 > goal:
        if small + how_many_big_ones * 5 >= goal:
            b = True

    return b

print(make_bricks(3, 1, 8))
print(make_bricks(3, 1, 9))
print(make_bricks(3, 2, 10))
