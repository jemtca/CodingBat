
# given an array of ints, return true if every element is a 1 or a 4
def only14(nums):
    b = True
    found = False
    
    i = 0
    while i < len(nums) and not found:
        if nums[i] != 1 and nums[i] != 4:
            b = False
            found = True
        i += 1

    return b

print(only14([1, 4, 1, 4]))
print(only14([1, 4, 2, 4]))
print(only14([1, 1]))
