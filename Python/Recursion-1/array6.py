
# given an array of ints, compute recursively if the array contains a 6
# we'll use the convention of considering only the part of the array that begins at the given index
# in this way, a recursive call can pass index+1 to move down the array
# the initial call will pass in index as 0
def array6(nums, index):
	if index < len(nums) and nums[index] == 6:
		return True
	elif index < len(nums) and nums[index] != 6:
		return array6(nums, index+1)
	else:
		return False

print(array6([1, 6, 4], 0))
print(array6([1, 4], 0))
print(array6([6], 0))
