
# given an list of ints, swap the first and last elements in the list
# return the modified list
# the list length will be at least 1
def swap_ends(nums):
    first = nums[0]
    last = nums[len(nums)-1]

    if len(nums) >= 0:
        nums[0] = last
        nums[len(nums)-1] = first

    return nums

print(swap_ends([1, 2, 3, 4]))
print(swap_ends([1, 2, 3]))
print(swap_ends([8, 6, 7, 9, 5]))
