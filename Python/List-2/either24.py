
# given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both
def either24(nums):
    b = False
    two = False
    four = False

    for x in range(len(nums)-1):
        if nums[x] == 2 and nums[x+1] == 2:
            b = True
            two = True
        elif nums[x] == 4 and nums[x+1] == 4:
            b = True
            four = True
    
    if two and four:
        b = False

    return b

print(either24([1, 2, 2]))
print(either24([4, 4, 1]))
print(either24([4, 4, 1, 2, 2]))
