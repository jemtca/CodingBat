
# this function return true if the given array does not contain any triples
# triple = a value appearing 3 times in a row
def no_triples(nums):
	b = True

	for x in range(0,len(nums) - 2):
		if nums[x] == nums[x + 1] and nums[x + 1] == nums[x + 2]:
			b = False

	return b

print(no_triples([1, 1, 2, 2, 1]))
print(no_triples([1, 1, 2, 2, 2, 1]))
print(no_triples([1, 1, 1, 2, 2, 2, 1]))
