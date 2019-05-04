
# we'll say that an element in an array is "alone" if there are values before and after it, and those values are different from it
# return a version of the given array where every instance of the given value which is alone is replaced by whichever value to its left or right is larger
def not_alone(nums, val):

    for x in range(len(nums)):
        if x != 0 and x != len(nums) - 1 and nums[x] == val:
            if nums[x-1] - nums[x+1] < 0:
                nums[x] = nums[x+1]
            elif nums[x-1] - nums[x+1] > 0:
                nums[x] = nums[x-1]
            else:
                nums[x] = nums[x-1]

    return nums

print(not_alone([1, 2, 3], 2))
print(not_alone([1, 2, 3, 2, 5, 2], 2))
print(not_alone([3, 4], 3))
