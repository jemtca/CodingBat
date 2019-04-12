
# given an array length 1 or more of ints, return the difference between the largest and smallest values in the array
def big_diff(nums):
    smallest = nums[0]
    largest = nums[0]

    for x in range(len(nums)-1):
        smallest = min(smallest, nums[x+1])

    for x in range(len(nums)-1):
        largest = max(largest, nums[x+1])

    return largest - smallest

print(big_diff([10, 3, 5, 6]))
print(big_diff([7, 2, 10, 9]))
print(big_diff([2, 10, 7, 2]))
