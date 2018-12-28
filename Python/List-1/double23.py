
# given an int list, return true if the list contains 2 twice, or 3 twice
# the list will be length 0, 1, or 2
def double23(nums):
    b = False

    if len(nums) == 2:
        if nums[0] == nums[1]:
            if nums[0] == 2 or nums[0] == 3:
                b = True

    return b

print(double23([2, 2]))
print(double23([3, 3]))
print(double23([2, 3]))
