
# start with 2 int lists, a and b, each length 2
# consider the sum of the values in each list
# return the list which has the largest sum
# in event of a tie, return a
def bigger_two(a, b):
    new_list = []

    if len(a) == 2 and len(b) == 2:
        if a[0] + a[1] >= b[0] + b[1]:
            new_list = a
        else:
            new_list = b

    return new_list

print(bigger_two([1, 2], [3, 4]))
print(bigger_two([3, 4], [1, 2]))
print(bigger_two([1, 1], [1, 2]))
