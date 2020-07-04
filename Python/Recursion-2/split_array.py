
# given an array of ints, is it possible to divide the ints into two groups, so that the sums of the two groups are the same
# every int must be in one group or the other
# write a recursive helper method that takes whatever arguments you like, and make the initial call to your recursive helper from split_array()
def split_array(nums):
    return split_array_helper(0, nums, 0, 0)

def split_array_helper(start, nums, group1, group2):
    if start >= len(nums):
        return group1 == group2
    else:
        return split_array_helper(start + 1, nums, group1 + nums[start], group2) or split_array_helper(start + 1, nums, group1, group2 + nums[start])

print(split_array([2, 2]))
print(split_array([2, 3]))
print(split_array([5, 2, 3]))
