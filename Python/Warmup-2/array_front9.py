
# this function return true if one of the first four elements in the given array is a 9
def array_front9(nums):
	b = False

	i = 0
	while i < len(nums) and not b:
		if i < 4 and nums[i] == 9:
			b = True
		elif (i == 4):
			break
		i += 1

	return b

print(array_front9([1, 2, 9, 3, 4]))
print(array_front9([1, 2, 3, 4, 9]))
print(array_front9([1, 2, 3, 4, 5]))
