
# given an array of ints, return true if the array contains no 1's and no 3's
def lucky13(nums):
    b = True

    for x in range(len(nums)):
        if nums[x] == 1 or nums[x] == 3:
            b = False
            break

    return b

print(lucky13([0, 2, 4]))
print(lucky13([1, 2, 3]))
print(lucky13([1, 2, 4]))
