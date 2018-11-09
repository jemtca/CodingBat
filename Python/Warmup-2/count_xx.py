
# this function return the number of "xx" in the given string
# overlapping is allowed
def count_xx(str):
	count = 0

	for x in range(len(str)-1):
		if str[x] == 'x' and str[x+1] == 'x':
			count += 1

	return count

print(count_xx("abcxx"))
print(count_xx("xxx"))
print(count_xx("xxxx"))
