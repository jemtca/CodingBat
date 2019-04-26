
# given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other
def have_three(nums):
    b = True
    found = False
    count = 0

    i = 0
    while i < len(nums) and not found:
        if i < len(nums) - 1 and nums[i] == 3 and nums[i+1] == 3:
            found = True
        elif nums[i] == 3:
            count += 1
        i += 1
    
    if count != 3:
        b = False

    return b

print(have_three([3, 1, 3, 1, 3]))
print(have_three([3, 1, 3, 3]))
print(have_three([3, 4, 3, 3, 4]))
