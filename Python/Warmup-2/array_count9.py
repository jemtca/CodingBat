
# this function return the number of 9´s in the given array
def array_count9(nums):
	count = 0

	for x in range(0,len(nums)):
		if nums[x] == 9:
			count += 1

	return count

print(array_count9([1, 2, 9]))
print(array_count9([1, 9, 9]))
print(array_count9([1, 9, 9, 3, 9]))
