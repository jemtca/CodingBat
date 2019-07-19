
# given an array of positive ints, return a new array of length "count" containing the first even numbers from the original array
# the original array will contain at least "count" even numbers
def copy_evens(nums, count):
    new_list = []
    c = 0

    i = 0
    while i < len(nums) and c < count:
        if nums[i] % 2 == 0:
            new_list.append(nums[i])
            c += 1
        i += 1

    return new_list

print(copy_evens([3, 2, 4, 5, 8], 2))
print(copy_evens([3, 2, 4, 5, 8], 3))
print(copy_evens([6, 1, 2, 4, 5, 8], 3))
