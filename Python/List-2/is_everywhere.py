
# we'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array, at least one of the pair is that value
# return true if the given value is everywhere in the array
def is_everywhere(nums, val):
    b = True
    found = False

    x = 0
    while x < len(nums) - 1 and not found:
        if nums[x] != val and nums[x+1] != val:
            b = False
            found = True
        x += 1

    return b

print(is_everywhere([1, 2, 1, 3], 1))
print(is_everywhere([1, 2, 1, 3], 2))
print(is_everywhere([1, 2, 1, 3, 4], 1))
