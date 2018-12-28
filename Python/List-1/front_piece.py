
# given an int list of any length, return a new list of its first 2 elements
# if the list is smaller than length 2, use whatever elements are present 
def front_piece(nums):
    new_list = []

    if len(nums) >= 0 and len(nums) < 2:
        new_list = nums
    else:
        new_list.append(nums[0])
        new_list.append(nums[1])

    return new_list

print(front_piece([1, 2, 3]))
print(front_piece([1, 2]))
print(front_piece([1]))
