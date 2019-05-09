
# given an array of ints, return true if the array contains a 2 next to a 2 somewhere
def has22(nums):
    b = False

    i = 0
    while i < len(nums)-1 and not b:
        if nums[i] == 2 and nums[i+1] == 2:
            b = True
        i += 1
    
    return b

print(has22([1, 2, 2]))
print(has22([1, 2, 1, 2]))
print(has22([2, 1, 2]))
