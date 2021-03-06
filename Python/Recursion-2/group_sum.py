
# given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target?
# this is a classic backtracking recursion problem
# once you understand the recursive backtracking strategy in this problem, you can use the same pattern for many problems to search a space of choices
# rather than looking at the whole array, our convention is to consider the part of the array starting at index start and continuing to the end of the array
# the caller can specify the whole array simply by passing start as 0
def groupSum(start, nums, target):
    if start >= len(nums):
        return target == 0
    else:
        # use item at start or not
        return groupSum(start + 1, nums, target - nums[start]) or groupSum(start + 1, nums, target)

print(groupSum(0, [2, 4, 8], 10))
print(groupSum(0, [2, 4, 8], 14))
print(groupSum(0, [2, 4, 8], 9))
