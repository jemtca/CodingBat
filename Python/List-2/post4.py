
# given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array
# the original array will contain at least one 4
def post4(nums):
    new_list = []
    found = False

    i = len(nums) - 1
    while (i >= 0 and not found):
        if nums[i] == 4:
            j = i + 1
            while (j < len(nums)):
                new_list.append(nums[j])
                j += 1
            found = True
        i -= 1


    return new_list

print(post4([2, 4, 1, 2]))
print(post4([4, 1, 4, 2]))
print(post4([4, 4, 1, 2, 3]))
