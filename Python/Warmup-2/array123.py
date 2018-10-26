
# this function return true if the sequence of number 1,2,3 appears somewhere in the given array of int values
def array123(nums):
	b = False
	s = ""

	for x in range(len(nums)):
		s = s + str(nums[x]);

	if "123" in s:
		b = True

	return b

print(array123([1, 1, 2, 3, 1]))
print(array123([1, 1, 2, 4, 1]))
print(array123([1, 1, 2, 1, 2, 3]))
