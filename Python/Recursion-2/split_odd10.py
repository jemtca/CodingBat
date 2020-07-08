
# given an array of ints, is it possible to divide the ints into two groups,
# so that the sum of one group is a multiple of 10, and the sum of the other group is odd
# every int must be in one group or the other
# write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from split_odd10()
def split_odd10(nums):
    return split_odd10_helper(0, nums, 0, 0)

def split_odd10_helper(start, nums, group1, group2):
    if start >= len(nums):
        return ((group1 % 10 == 0 and group2 % 2 != 0) or (group2 % 10 == 0 and group1 % 2 != 0))
    else:
        return split_odd10_helper(start + 1, nums, group1 + nums[start], group2) or split_odd10_helper(start + 1, nums, group1, group2 + nums[start])

print(split_odd10([5, 5, 5]))
print(split_odd10([5, 5, 6]))
print(split_odd10([5, 5, 6, 1]))
