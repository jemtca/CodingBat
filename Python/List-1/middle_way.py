
# given 2 int lists, a and b, each length 3, return a new array length 2 containing their middle elements
def middle_way(a, b):
    new_list = []

    if len(a) == 3 and len(b) == 3:
        new_list.append(a[1])
        new_list.append(b[1])

    return new_list

print(middle_way([1, 2, 3], [4, 5, 6]))
print(middle_way([7, 7, 7], [3, 8, 0]))
print(middle_way([5, 2, 0], [1, 2, 3]))
