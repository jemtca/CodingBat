
# given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array
def has12(nums):
    b = False
    success = False

    i = 0
    while i < len(nums) and not success:
        if nums[i] == 1:
            j = i + 1
            while j < len(nums) and not success:
                if nums[j] == 2:
                    b = True
                    success = True
                j += 1
        i += 1

    return b

print(has12([1, 3, 2]))
print(has12([3, 1, 2]))
print(has12([3, 1, 4, 5, 2]))
