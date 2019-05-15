
# given an array of ints, return true if every 2 that appears in the array is next to another 2
def two_two(nums):
    b = True

    for x in range(len(nums)):
        if len(nums) == 1 and nums[x] == 2:
            b = False
        elif x == 0 and nums[x] == 2 and nums[x+1] != 2:
            b = False
        elif x == len(nums)-1 and nums[len(nums)-1] == 2 and nums[len(nums)-2] != 2:
            b = False
        elif x < len(nums)-1 and (nums[x] == 2 and nums[x+1] != 2) and (nums[x] == 2 and nums[x-1] != 2):
            b = False


    return b

print(two_two([4, 2, 2, 3]))
print(two_two([2, 2, 4]))
print(two_two([2, 2, 4, 2]))
