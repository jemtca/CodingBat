
# given a list of ints length 3, return a list with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}
def rotate_left3(nums):
    new_list = []

    new_list.append(nums[1])
    new_list.append(nums[2])
    new_list.append(nums[0])

    return new_list

print(rotate_left3([1, 2, 3]))
print(rotate_left3([5, 11, 9]))
print(rotate_left3([7, 0, 0]))
