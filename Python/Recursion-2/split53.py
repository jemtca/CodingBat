
# given an array of ints, is it possible to divide the ints into two groups, so that the sum of the two groups is the same, with these constraints:
# all the values that are multiple of 5 must be in one group, and all the values that are a multiple of 3 (and not a multiple of 5) must be in the other
def split53(nums):
    return split53_helper(0, nums, 0, 0)

def split53_helper(start, nums, group1, group2):
    if start >= len(nums):
        return group1 == group2
    else:
        if nums[start] % 5 == 0:
            return split53_helper(start + 1, nums, group1 + nums[start], group2)
        elif nums[start] % 3 == 0 and nums[start] % 5 != 0:
            return split53_helper(start + 1, nums, group1, group2 + nums[start])
        else:
            return split53_helper(start + 1, nums, group1 + nums[start], group2) or split53_helper(start + 1, nums, group1, group2 + nums[start])

print(split53([1, 1]))
print(split53([1, 1, 1]))
print(split53([2, 4, 2]))
