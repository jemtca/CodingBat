
# given an array of ints, return true if the array contains either 3 even or 3 odd values all next to each other
def mod_three(nums):
    b = False

    for x in range(len(nums)-2):
        if ((nums[x] % 2 == 0 and nums[x+1] % 2 == 0 and nums[x+2] % 2 == 0) or
            (nums[x] % 2 != 0 and nums[x+1] % 2 != 0 and nums[x+2] % 2 != 0)):
            b = True

    return b

print(mod_three([2, 1, 3, 5]))
print(mod_three([2, 1, 2, 5]))
print(mod_three([2, 4, 2, 5]))
