
#
# given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0
# return the changed array
def fix23(nums):

    if len(nums) == 3:
        if nums[0] == 2 and nums[1] == 3:
            nums[1] = 0
        elif nums[1] == 2 and nums[2] == 3:
            nums[2] = 0

    return nums

print(fix23([1, 2, 3]))
print(fix23([2, 0, 5]))
print(fix23([1, 2, 1]))
