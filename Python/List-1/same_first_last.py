
# given a list of ints, return true if the list is length 1 or more, and the first element and the last element are equal
def same_first_last(nums):
    b = False

    if len(nums) > 0 and nums[0] == nums[len(nums)-1]:
        b = True

    return b

print(same_first_last([1, 2, 3]))
print(same_first_last([1, 2, 3, 1]))
print(same_first_last([1, 2, 1]))
