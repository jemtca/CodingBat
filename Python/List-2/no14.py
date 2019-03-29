
# given an array of ints, return true if it contains no 1's or it contains no 4's
def no14(nums):
    b = True
    one = False
    four = False

    for x in range(len(nums)):
        if nums[x] == 1:
            one = True

    for x in range(len(nums)):
        if nums[x] == 4:
            four = True
    
    if one and four:
        b = False

    return b

print(no14([1, 2, 3]))
print(no14([1, 2, 3, 4]))
print(no14([2, 3, 4]))
