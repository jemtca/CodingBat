
# given 2 int lists, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by the elements from b
# the lists may be any length, including 0, but there will be 2 or more elements available between the 2 lists
def make2(a, b):
    new_list = []

    if len(a) + len(b) > 1:
        if len(a) == 0:
            new_list.append(b[0])
            new_list.append(b[1])
        elif len(a) == 1:
            new_list.append(a[0])
            new_list.append(b[0])
        else:
            new_list.append(a[0])
            new_list.append(a[1])

    return new_list

print(make2([4, 5], [1, 2, 3]))
print(make2([4], [1, 2, 3]))
print(make2([], [1, 2]))
