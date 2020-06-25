
# given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target with this additional constraint:
# if a value in the array is chosen to be in the group, the value immediately following it in the array must not be chosen
def group_no_adj(start, nums, target):
    if start >= len(nums):
        return target == 0
    
    # chosen
    if group_no_adj(start + 2, nums, target - nums[start]):
        return True
    # not chosen
    if group_no_adj(start + 1, nums, target):
        return True

    return False

print(group_no_adj(0, [2, 4, 8], 10))
print(group_no_adj(0, [2, 4, 8], 14))
print(group_no_adj(0, [2, 4, 8], 7))
