
# given a list of ints, return a new list length 2 containing the first and last elements from the original list
# the original list will be length 1 or more
def make_ends(nums):
    new_list = []

    if len(nums) > 0:
        new_list.append(nums[0])
        new_list.append(nums[len(nums)-1])

    return new_list

print(make_ends([1, 2, 3]))
print(make_ends([1, 2, 3, 4]))
print(make_ends([7, 4, 6, 2]))
