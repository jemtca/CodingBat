
# given an array of ints, return true if the sum of all the 2's in the array is exactly 8
def sum28(nums):
    b = False
    count = 0

    for x in range(len(nums)):
        if nums[x] == 2:
            count += 1

    if count == 4:
        b = True

    return b

print(sum28([2, 3, 2, 2, 4, 2]))
print(sum28([2, 3, 2, 2, 4, 2, 2]))
print(sum28([1, 2, 3, 4]))
