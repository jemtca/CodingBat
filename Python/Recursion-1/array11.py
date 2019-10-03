
# given an array of ints, compute recursively the number of times that the value 11 appears in the array
# we'll use the convention of considering only the part of the array that begins at the given index
# in this way, a recursive call can pass index+1 to move down the array
# the initial call will pass in index as 0
def array11(nums, index):
    count = 0

    if index == len(nums):
        return count
    if nums[index] == 11:
        count += 1

    return count + array11(nums, index+1)

print(array11([1, 2, 11], 0))
print(array11([11, 11], 0))
print(array11([1, 2, 3, 4], 0))
