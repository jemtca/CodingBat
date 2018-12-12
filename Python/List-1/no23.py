
# given an int array length 2, return true if it does not contain a 2 or 3
def no23(nums):
    b = True

    if len(nums) == 2:
        if nums[0] == 2 or nums[0] == 3 or nums[1] == 2 or nums[1] == 3:
            b = False

    return b

print(no23([4, 5]))
print(no23([4, 2]))
print(no23([3, 5]))
