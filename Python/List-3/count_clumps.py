
# say that a "clump" in an array is a series of 2 or more adjacent elements of the same value
# return the number of clumps in the given array
def count_clumps(nums):
    count_clumps = 0
    match = False

    for x in range(len(nums) - 1):
        if nums[x] == nums[x+1] and not match:
            match = True
            count_clumps += 1
        elif nums[x] != nums[x+1]:
            match = False

    return count_clumps

print(count_clumps([1, 2, 2, 3, 4, 4]))
print(count_clumps([1, 1, 2, 1, 1]))
print(count_clumps([1, 1, 1, 1, 1]))
