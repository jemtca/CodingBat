
# this function return the number of times that two 6's are next to each other in the given array
# also count instances where the second 6 is actually a 7
def array667(nums):
	count = 0

	for x in range(len(nums)-1):
		if nums[x] == 6 and (nums[x+1] == 6 or nums[x+1] == 7):
			count += 1

	return count

print(array667([6, 6, 2]))
print(array667([6, 6, 2, 6]))
print(array667([6, 7, 2, 6]))
