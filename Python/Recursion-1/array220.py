
# given an array of ints, compute recursively if the array contains somewhere a value followed in the array by that value times 10
# we'll use the convention of considering only the part of the array that begins at the given index
# in this way, a recursive call can pass index+1 to move down the array
# the initial call will pass in index as 0
def array220(nums, index):
    if len(nums) < 1 or index == len(nums)-1:
        return False
    elif nums[index+1] == nums[index]*10:
        return True
    else:
        return array220(nums, index+1)

print(array220([1, 2, 20], 0))
print(array220([3, 30], 0))
print(array220([3], 0))
