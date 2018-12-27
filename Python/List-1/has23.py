
# given an int list length 2, return true if it contains a 2 or a 3
def has23(nums):
    b = False

    if len(nums) == 2:
        if nums[0] == 2 or nums[0] == 3 or nums[1] == 2 or nums[1] == 3:
            b = True

    return b

print(has23([2, 5]))
print(has23([4, 3]))
print(has23([4, 5]))
