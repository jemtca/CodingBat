
# return an array that is "left shifted" by one, so {6, 2, 5, 3} returns {2, 5, 3, 6}
# you may modify and return the given array, or return a new array
def shift_left(nums):
    new_list = []

    if len(nums) > 0:
        for x in range(len(nums) - 1):
            new_list.append(nums[x+1])
        new_list.append(nums[0])

    return new_list

print(shift_left([6, 2, 5, 3]))
print(shift_left([1, 2]))
print(shift_left([1]))
