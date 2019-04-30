
# return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25
def triple_up(nums):
    b = False
    found = False

    i = 0
    while i < len(nums)-2 and not found:
        if nums[i+1] == nums[i]+1 and nums[i+2] == nums[i]+2:
            b = True
            found = True
        i += 1

    return b

print(triple_up([1, 4, 5, 6, 2]))
print(triple_up([1, 2, 3]))
print(triple_up([1, 2, 4]))
