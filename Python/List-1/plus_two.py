
# given 2 int lists, each length 2, return a new array length 4 containing all their elements
def plus_two(a, b):
    new_list = []

    if len(a) == 2 and len(b) == 2:
        new_list.append(a[0])
        new_list.append(a[1])
        new_list.append(b[0])
        new_list.append(b[1])

    return new_list

print(plus_two([1, 2], [3, 4]))
print(plus_two([4, 4], [2, 2]))
print(plus_two([9, 2], [3, 4]))
