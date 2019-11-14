
# we'll say that a "pair" in a string is two instances of a char separated by a char
# so "AxA" the A's make a pair
# pair's can overlap, so "AxAxA" contains 3 pairs -- 2 for A and 1 for x
# recursively compute the number of pairs in the given string
def count_pairs(str):
	if len(str) < 3:
		return 0

	if str[0] == str[2]:
		return 1 + count_pairs(str[1:])
	else:
		return count_pairs(str[1:])

print(count_pairs('axa'))
print(count_pairs('axax'))
print(count_pairs('axbx'))
