
# given an array of ints, return true if the number of 1's is greater than the number of 4's
def has14(nums):
    b = False
    n1 = 0
    n4 = 0

    for x in range(len(nums)):
        if nums[x] == 1:
            n1 += 1
        elif nums[x] == 4:
            n4 += 1
    
    if n1 > n4:
        b = True

    return b

print(has14([1, 4, 1]))
print(has14([1, 4, 1, 4]))
print(has14([1, 1]))
