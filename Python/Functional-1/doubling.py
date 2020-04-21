
# given a list of integers, return a list where each integer is multiplied by 2
def doubling(list):
    new_list = []
    
    for x in list:
        new_list.append(x * 2)

    return new_list

print(doubling([1, 2, 3]))
print(doubling([6, 8, 6, 8, -1]))
print(doubling([]))
