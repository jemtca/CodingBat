
# return a version of the given array where all the 10's have been removed
# the remaining elements should shift left towards the start of the array as needed, and the empty spaces a the end of the array should be 0
# so {1, 10, 10, 2} yields {1, 2, 0, 0}
def without_ten(nums):
    new_list = []
    index = 0

    for x in range(len(nums)):
        if nums[x] != 10:
            new_list.append(nums[x])
            index += 1

    while(index < len(nums)):
        new_list.append(0)
        index += 1

    return new_list

print(without_ten([1, 10, 10, 2]))
print(without_ten([10, 2, 10]))
print(without_ten([1, 99, 10]))
