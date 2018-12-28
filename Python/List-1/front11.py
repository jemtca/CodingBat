
# given 2 int lists, a and b, of any length, return a new list with the first element of each list
# if either list is length 0, ignore that list
def front11(a, b):
    new_list = []

    if a and b:
        new_list.append(a[0])
        new_list.append(b[0])
    elif a and not b:
        new_list.append(a[0])
    elif not a and b:
        new_list.append(b[0])
    
    return new_list

print(front11([1, 2, 3], [7, 9, 8]))
print(front11([1], [2]))
print(front11([1, 7], []))
