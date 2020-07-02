
# given an array of ints, is it possible to choose a group of some of the ints, such that the group sums to the given target,
# with this additional constraint: if there are numbers in the array that are adjacent and the identical value,
# they must either all be chosen, or none of them chosen
# for example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in the middle must be chosen or not, all as a group
# (one loop can be used to find the extent of the identical values)
def group_sum_clump(start, nums, target):
    return

print(group_sum_clump(0, [2, 4, 8], 10))
print(group_sum_clump(0, [1, 2, 4, 8, 1], 10))
print(group_sum_clump(0, [2, 4, 4, 8], 14], 10))
