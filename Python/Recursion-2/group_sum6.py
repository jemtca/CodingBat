
# given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target?
# however, with the additional constraint that all 6's must be chosen
def group_sum6(start, nums, target):
    if start >= len(nums):
        return (target == 0)

    if group_sum6(start + 1, nums, target - nums[start]):
        return True
    if nums[start] != 6 and group_sum6(start + 1, nums, target):
        return True

    return False

print(group_sum6(0, [2, 4, 8], 8))
print(group_sum6(0, [2, 4, 8], 9))
print(group_sum6(0, [2, 4, 8], 7))
