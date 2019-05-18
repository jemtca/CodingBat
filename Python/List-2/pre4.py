
# given a non-empty array of ints, return a new array containing the elements from the original array that come before the first 4 in the original array
# the original array will contain at least one 4
def pre4(nums):
    new_list = []
    found = False

    i = 0
    while i < len(nums) and not found:
        if nums[i] != 4:
            new_list.append(nums[i])
        elif nums[i] == 4:
            found = True
        i += 1

    return new_list

print(pre4([1, 2, 4, 1]))
print(pre4([3, 1, 4]))
print(pre4([1, 4, 4]))
