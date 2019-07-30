
# we'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive)
# given an array of positive ints, return a new array of length "count" containing the first endy numbers from the original array
def copy_endy(nums, count):
    x = []
    j = 0

    i = 0
    while i < len(nums) and j < count:
        if (nums[i] >= 0 and nums[i] <= 10) or (nums[i] >= 90 and nums[i] <= 100):
            x.append(nums[i])
            j += 1
        i += 1

    return x

print(copy_endy([9, 11, 90, 22, 6], 2))
print(copy_endy([9, 11, 90, 22, 6], 3))
print(copy_endy([12, 1, 1, 13, 0, 20], 2))
