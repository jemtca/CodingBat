
# given an array of ints, is it possible to choose a group of some of the ints, beginning at the start index, such that the group sums to the given target?
# however, with the additional constraint that all 6's must be chosen
def group_sum6(start, nums, target):
    if start >= len(nums):
        return target == 0
    else:
        # all 6's must be chosen
        if nums[start] == 6:
            return group_sum6(start + 1, nums, target - nums[start])
        else:
            # use item at start or not
            return group_sum6(start + 1, nums, target - nums[start]) or group_sum6(start + 1, nums, target)

print(group_sum6(0, [2, 4, 8], 8))
print(group_sum6(0, [2, 4, 8], 9))
print(group_sum6(0, [2, 4, 8], 7))
