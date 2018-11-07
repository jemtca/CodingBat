
# this function return true if the given array contains 2, 7, 1
# pattern: a value, followed by the value plus 5, followed by the value minus 1
# additionally the 271 counts even if the "1" differs by 2 or less from the correct value
def has271(nums):
	b = False

	for x in range(0,len(nums)-2):
		if nums[x+1] == nums[x]+5 and abs(nums[x+2] - nums[x]-1) <= 2:
			b = True

	return b

print(has271([1, 2, 7, 1]))
print(has271([1, 2, 8, 1]))
print(has271([2, 7, 1]))
